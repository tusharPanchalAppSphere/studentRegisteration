package com.Student.studentRegisteration.Repositories;

import com.Student.studentRegisteration.Entity.Requests.UserReq;
import com.Student.studentRegisteration.Entity.User;
import com.Student.studentRegisteration.Exception.UserAlreadyExistsException;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.Objects;

public  class UserRepoImpl extends JdbcTemplate implements UserRepo{

    @Autowired
    private DataSource dataSource;


    @PostConstruct
    public void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public String singUp(UserReq user) throws UserAlreadyExistsException {
        if(!Objects.isNull(getUser(user))){
            throw new UserAlreadyExistsException("USER ALREADY EXISTS");
        }
        else{
            String getIdSql = "SELECT user_id_seq.NEXTVAL FROM DUAL";
            String userId = this.queryForObject(getIdSql, String.class);
            String getPwdId = "SELECT pwd_id_seq.NEXTVAL FROM DUAL";
            String pwdId = this.queryForObject(getPwdId, String.class);
            this.update("INSERT INTO USERS (ID,NAME,EMAIL,PHONENO) VALUES (?,?,?,?)",userId,user.getName(),user.getEmail(),user.getPhoneNo());
            this.update("INSERT INTO PASSWORD (ID,VALUE,USER_ID) VALUES(?,?,?)",user.getPwd(),userId);
            return userId;
        }
    }

    public User getUser(UserReq user){
      User userRes =  this.queryForObject(String.format("SELECT * FROM USER WHERE EMAIL = '%s' or phoneNo = '%s",user.getEmail(),user.getPhoneNo()),User.class);
      return userRes;
    }
}
