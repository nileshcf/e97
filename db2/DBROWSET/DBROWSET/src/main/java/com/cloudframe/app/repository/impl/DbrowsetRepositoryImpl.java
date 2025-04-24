package com.cloudframe.app.repository.impl;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.repository.DbrowsetRepository;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.dao.SqlBase;
import java.sql.ResultSet;
import com.cloudframe.app.dao.CfSqlca;
import java.sql.SQLException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cloudframe.app.dbrowset.dto.*;

@Repository
@Qualifier("dbrowsetRepository")
public class DbrowsetRepositoryImpl implements DbrowsetRepository {
    Logger logger = LoggerFactory.getLogger(DbrowsetRepositoryImpl.class);

// declare:start
    int sqlFetchCounter = 0;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:openSecCursorDbrowset
    
/**
******DECLARE SEC_CURSOR CURSOR WITH ROWSET POSITIONING FOR        
******   SELECT                                                    
******      ISIN                                                   
******     ,SEDOL                                                  
******     ,RIC                                                    
******   FROM TBDEMSEC                                             
******   ORDER BY ISIN  ASC                                        
**/
    public ResultSet openSecCursorDbrowset(Sqlca sqlca) throws Exception {
ResultSet secCursorResultSet = null;
try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	secCursorResultSet = db2Base.startQuery(1/* SQL Sequence*/, CONSTANTS.LITERAL_DBROWSET)
    .withSql(SQLS.SQL_2003242466)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}

return secCursorResultSet;
    }
// methodEnd:openSecCursorDbrowset
// methodStart:fetchSecCursorDbrowset
    
/**
******     FETCH NEXT ROWSET FROM SEC_CURSOR                       
******      FOR :WS-MAX-ROWS ROWS INTO                             
******              :WS-ISIN                                       
******             ,:WS-SEDOL                                      
******             ,:WS-RIC                                        
**/
    public void fetchSecCursorDbrowset(ResultSet secCursorResultSet, Misc misc, Sqlca sqlca, SecTable secTable) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < misc.getMaxRows()) {
       hasResults = secCursorResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = secCursorResultSet.getObject(1);
 if (resultObj != null) {
   secTable.setIsin(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = secCursorResultSet.getString(2);
 if (resultObjString != null) {
   secTable.setSedol(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObjString = secCursorResultSet.getString(3);
 if (resultObjString != null) {
   secTable.setRic(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
          sqlFetchCounter++;
          ftchRowCnt++;
	    } else {
	         sqlca.setSqlcode(100); // No More rows
	    }
	    sqlca.setSqlerrd(2, ftchRowCnt);
   }
}
catch (SQLException e) {
    if(e.getMessage().contains("result set is closed"))
		fill501SqlcaObject(sqlca); // cursor closed

	else {
 		logger.error("secCursorResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchSecCursorDbrowset
// methodStart:closeSecCursorDbrowset
    
/**
******   CLOSE SEC_CURSOR                                          
**/
    public void closeSecCursorDbrowset(ResultSet secCursorResultSet, Sqlca sqlca) throws Exception {

	closeCursor(secCursorResultSet,sqlca);

    }
// methodEnd:closeSecCursorDbrowset
// methodStart:fillSqlcaObject
    public void fillSqlcaObject(Sqlca sqlca, SQLException e) {
            CfSqlca db2Sqlca = Db2Base.getCfSqlca(e);
            if (db2Sqlca != null) {
                sqlca.setSqlcaid("SQLCA  ".toCharArray());
                sqlca.setSqlcabc(136);
                sqlca.setSqlcode(db2Sqlca.getSqlCode());
                sqlca.setSqlerrp(db2Sqlca.getSqlErrp().toCharArray());
                if(db2Sqlca.getSqlErrmc() != null) {
                     sqlca.getSqlerrm().setSqlerrml(db2Sqlca.getSqlErrmc().length());
                     char ch = 65533;
                     char[] errmc = db2Sqlca.getSqlErrmc().toCharArray();
                      for(int i =0 ;i< errmc.length;i++){
                         if(errmc[i]==';'){
                              errmc[i] = ch;
                         }
                      }
                     sqlca.getSqlerrm().setSqlerrmc(errmc);
                }
                int[] sqlErrd = db2Sqlca.getSqlErrd();
                for (int i = 0; i < sqlErrd.length; i++) {
                    sqlca.setSqlerrd(i, sqlErrd[i]);
                }
                char[] sqlWarn = db2Sqlca.getSqlWarn();
                for (int i = 0; i < sqlWarn.length; i++) {
                    switch (i) {
                        case 0:
                            sqlca.getSqlwarn().setSqlwarn0(new char[]{sqlWarn[0]});
                            break;
                        case 1:
                            sqlca.getSqlwarn().setSqlwarn1(new char[]{sqlWarn[1]});
                            break;
                        case 2:
                            sqlca.getSqlwarn().setSqlwarn2(new char[]{sqlWarn[2]});
                            break;
                        case 3:
                            sqlca.getSqlwarn().setSqlwarn3(new char[]{sqlWarn[3]});
                            break;
                        case 4:
                            sqlca.getSqlwarn().setSqlwarn4(new char[]{sqlWarn[4]});
                            break;
                        case 5:
                            sqlca.getSqlwarn().setSqlwarn5(new char[]{sqlWarn[5]});
                            break;
                        case 6:
                            sqlca.getSqlwarn().setSqlwarn6(new char[]{sqlWarn[6]});
                            break;
                        case 7:
                            sqlca.getSqlwarn().setSqlwarn7(new char[]{sqlWarn[7]});
                            break;
                        case 8:
                            sqlca.getSqlext().setSqlwarn8(new char[]{sqlWarn[8]});
                            break;
                        case 9:
                            sqlca.getSqlext().setSqlwarn9(new char[]{sqlWarn[9]});
                            break;
                        case 10:
                            sqlca.getSqlext().setSqlwarna(new char[]{sqlWarn[10]});
                            break;
                    }
                }
                sqlca.getSqlext().setSqlstate(db2Sqlca.getSqlState().toCharArray());
        } else {
            sqlca.setSqlcode(Db2Base.fillSQLCode(e.getMessage()));
        }
    }
// methodEnd:fillSqlcaObject



    public void fill501SqlcaObject(Sqlca sqlca) {
                sqlca.setSqlcode(-501);
                sqlca.setSqlerrp("DSNXERT".toCharArray());
                sqlca.setSqlerrd(0,-240);
    	  		sqlca.setSqlerrd(1,0);
		    	sqlca.setSqlerrd(2,0);
		    	sqlca.setSqlerrd(3,-1);
		    	sqlca.setSqlerrd(4,0);
		    	sqlca.setSqlerrd(5,0);
			    sqlca.getSqlext().setSqlstate("24501".toCharArray());
    }

public void closeCursor(ResultSet result, Sqlca sqlca) throws Exception {
        sqlca.setSqlcode(0);
	try { 
	db2Base.closeCursor(result);
} catch(Exception e) {
	logger.info("{} close had exception", result);
}

db2Base.updateFetchCounter(sqlFetchCounter);
}

}
