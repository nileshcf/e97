package com.cloudframe.app.repository.impl;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.repository.CobpgmorRepository;
import java.math.MathContext;
import com.cloudframe.app.common.CONSTANTS;
import java.math.BigDecimal;
import com.cloudframe.app.dao.SqlBase;
import java.sql.ResultSet;
import com.cloudframe.app.dao.CfSqlca;
import java.sql.SQLException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cloudframe.app.cobpgmor.dto.*;

@Repository
@Qualifier("cobpgmorRepository")
public class CobpgmorRepositoryImpl implements CobpgmorRepository {
    Logger logger = LoggerFactory.getLogger(CobpgmorRepositoryImpl.class);

// declare:start
    ResultSet ccurResultSet = null;
int sqlFetchCounter = 0;
ResultSet resultSet = null;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:openCcurCobpgmor
    
/**
******    DECLARE CCUR CURSOR FOR                                  
******    SELECT ENO                                               
******    ,ENAME                                                   
******    ,EADD                                                    
******    ,ESAL                                                    
******    ,EDOJ                                                    
******    FROM CLOUDFRM.TBJEMP                                     
******    ORDER BY ENO                                             
**/
    public void openCcurCobpgmor(Sqlca sqlca) throws Exception {

try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	ccurResultSet = db2Base.startQuery(1/* SQL Sequence*/, CONSTANTS.LITERAL_COBPGMOR)
    .withSql(SQLS.SQL_736182726)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}


    }
// methodEnd:openCcurCobpgmor
// methodStart:closeCcurCobpgmor
    
/**
******   CLOSE CCUR                                                
**/
    public void closeCcurCobpgmor(Sqlca sqlca) throws Exception {


    sqlca.setSqlcode(0);
	db2Base.updateFetchCounter(sqlFetchCounter);
    }
// methodEnd:closeCcurCobpgmor
// methodStart:fetchCcurCobpgmor
    
/**
******   FETCH CCUR                                                
******   INTO :HV-EREC   :INDSTRUC                                 
**/
    public void fetchCcurCobpgmor(Ibook ibook, Sqlca sqlca, HvErec hvErec) throws Exception {
try {
	boolean hasResults = ccurResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = ccurResultSet.getObject(1);
 if (resultObj != null) {
   ibook.setIndstruc(0, (short) 0);hvErec.setHvEno((short) ((Integer) resultObj ).intValue());
 } else {ibook.setIndstruc(0, (short) -1);
 }
 resultObj = ccurResultSet.getObject(2);
 if (resultObj != null) {
   ibook.setIndstruc(1, (short) 0);hvErec.setHvEname( resultObj.toString().toCharArray() );
 } else {ibook.setIndstruc(1, (short) -1);
 }
 resultObj = ccurResultSet.getObject(3);
 if (resultObj != null) {
   ibook.setIndstruc(2, (short) 0);hvErec.setHvEadd( resultObj.toString().toCharArray() );
 } else {ibook.setIndstruc(2, (short) -1);
 }
 resultObj = ccurResultSet.getObject(4);
 if (resultObj != null) {
   try {   
   ibook.setIndstruc(3, (short) 0);hvErec.setHvEsal( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        hvErec.setHvEsal( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        hvErec.setHvEsal( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        hvErec.setHvEsal( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
 } else {ibook.setIndstruc(3, (short) -1);
 }
 resultObjString = ccurResultSet.getString(5);
 if (resultObjString != null) {
   ibook.setIndstruc(4, (short) 0);hvErec.setHvEdoj( resultObjString.toCharArray() );
 } else {ibook.setIndstruc(4, (short) -1);
 }
		sqlFetchCounter++;
	} else {
		sqlca.setSqlcode(100); // No More rows
	}
}


catch (SQLException e) {
    if(e.getMessage().contains("result set is closed")) {
		fill501SqlcaObject(sqlca); // cursor closed
	}
	else {
 		logger.error("ccurResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchCcurCobpgmor
// methodStart:selectTbjemp
    
/**
******    SELECT COUNT(*) INTO :WS-COUNT                           
******    FROM CLOUDFRM.TBJEMP                                     
**/
    public void selectTbjemp(Sqlca sqlca, Work work) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(5/* SQL Sequence*/, CONSTANTS.LITERAL_COBPGMOR)
.withSql(SQLS.SQL_249631150)
	.queryForList();
	// check sqlca.getSqlcode() or errors
	sqlca.setSqlcode(Db2Base.fillSQLCode(resultSet));
	if (sqlca.getSqlcode() != 100) {
	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = resultSet.getObject(1);
 if (resultObj != null) {
   work.setCount( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
		if (resultSet.next()) sqlca.setSqlcode(-811);
	}else{
	sqlca.setSqlerrp("DSNXRFF".toCharArray());
int[] arr = {-110, 0, 0, -1, 0, 0};
for (int i = 0; i < arr.length; i++) {
sqlca.setSqlerrd(i, arr[i]);
}
sqlca.getSqlext().setSqlstate("02000".toCharArray());
	}
}
catch (SQLException e) {
			fillSqlcaObject(sqlca, e);
}
catch(Exception e) {
	throw e;
}
    }
// methodEnd:selectTbjemp
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


}
