package com.cloudframe.app.repository.impl;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.dao.Db2Base;
import com.cloudframe.app.common.CONSTANTS;
import java.math.BigDecimal;
import com.cloudframe.app.dao.SqlBase;
import java.sql.ResultSet;
import com.cloudframe.app.repository.Bm80022Repository;
import com.cloudframe.app.dao.CfSqlca;
import java.sql.SQLException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cloudframe.app.bm80022.dto.*;

@Repository
@Qualifier("bm80022Repository")
public class Bm80022RepositoryImpl implements Bm80022Repository {
    Logger logger = LoggerFactory.getLogger(Bm80022RepositoryImpl.class);

// declare:start
    int sqlFetchCounter = 0;
ResultSet curGe18ResultSet = null;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:openCurGe18Bm80022
    
/**
******     DECLARE CUR_GE18 CURSOR WITH ROWSET POSITIONING FOR     
******     SELECT   GE1801_CODENTID,                               
******              GE1801_TIPPRODUCT,                             
******              GE1801_CODCONTRAT,                             
******              GE1801_OFIGESTORA,                             
******              GE1801_IDEPSIG,                                
******              GE1801_NUMPERSONA,                             
******              GE1801_NUMCARTERA,                             
******              GE1801_CODCARTERA,                             
******              GE1801_FECHAALTA,                              
******              GE1801_FECHABAJA,                              
******              GE1801_CODNODO,                                
******              GE1801_RESAMBITO,                              
******              GE1801_NUMRESAMB,                              
******              GE1801_NUMPRESAMB,                             
******              GE1801_CENGESCAPT,                             
******              GE1801_NUMGESCAP,                              
******              GE1801_NUMPGESCAP,                             
******              GE1801_NUMPESPRIE,                             
******              GE1801_CODCARRIE,                              
******              GE1801_FECCIECURSO                             
******     FROM GE1801                                             
******     WHERE GE1801_CODENTID > ''                              
******     ORDER BY GE1801_CODENTID                                
**/
    public void openCurGe18Bm80022(Sqlca sqlca) throws Exception {

try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	curGe18ResultSet = db2Base.startQuery(1/* SQL Sequence*/, CONSTANTS.LITERAL_BM80022)
    .withSql(SQLS.SQL_251517477)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}


    }
// methodEnd:openCurGe18Bm80022
// methodStart:fetchCurGe18Bm80022
    
/**
******   FETCH NEXT ROWSET FROM CUR_GE18                           
******     FOR 100 ROWS                                            
******      INTO :GE1801-A-CODENTID,                               
******           :GE1801-A-TIPPRODUCT,                             
******           :GE1801-A-CODCONTRAT,                             
******           :GE1801-A-OFIGESTORA,                             
******           :GE1801-A-IDEPSIG,                                
******           :GE1801-A-NUMPERSONA,                             
******           :GE1801-A-NUMCARTERA,                             
******           :GE1801-A-CODCARTERA,                             
******           :GE1801-A-FECHAALTA,                              
******           :GE1801-A-FECHABAJA,                              
******           :GE1801-A-CODNODO,                                
******           :GE1801-A-RESAMBITO,                              
******           :GE1801-A-NUMRESAMB,                              
******           :GE1801-A-NUMPRESAMB,                             
******           :GE1801-A-CENGESCAPT,                             
******           :GE1801-A-NUMGESCAP,                              
******           :GE1801-A-NUMPGESCAP,                             
******           :GE1801-A-NUMPESPRIE,                             
******           :GE1801-A-CODCARRIE,                              
******           :GE1801-A-FECCIECURSO                             
**/
    public void fetchCurGe18Bm80022(Sqlca sqlca, Ge1801Array ge1801Array) throws Exception {
try {
   boolean hasResults = true;
   sqlca.setSqlcode(0);
   int ftchRowCnt = 0;
   while (hasResults && ftchRowCnt < 100) {
       hasResults = curGe18ResultSet.next();
   	   if (hasResults) {
          // Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObj = curGe18ResultSet.getObject(1);
 if (resultObj != null) {
   ge1801Array.setGe1801ACodentid(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = curGe18ResultSet.getObject(2);
 if (resultObj != null) {
   ge1801Array.setGe1801ATipproduct(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = curGe18ResultSet.getObject(3);
 if (resultObj != null) {
   ge1801Array.setGe1801ACodcontrat(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)).longValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = curGe18ResultSet.getObject(4);
 if (resultObj != null) {
   ge1801Array.setGe1801AOfigestora(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)).shortValue());
} else {sqlca.setSqlcode(-305); }
 resultObj = curGe18ResultSet.getObject(5);
 if (resultObj != null) {
   ge1801Array.setGe1801AIdepsig(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = curGe18ResultSet.getObject(6);
 if (resultObj != null) {
   try {   
   ge1801Array.setGe1801ANumpersona(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        ge1801Array.setGe1801ANumpersona(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        ge1801Array.setGe1801ANumpersona(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        ge1801Array.setGe1801ANumpersona(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = curGe18ResultSet.getObject(7);
 if (resultObj != null) {
   ge1801Array.setGe1801ANumcartera(ftchRowCnt, (Db2Base.castToBigDecimal(resultObj)).intValue());
} else {sqlca.setSqlcode(-305); }
 resultObjString = curGe18ResultSet.getString(8);
 if (resultObjString != null) {
   ge1801Array.setGe1801ACodcartera(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObjString = curGe18ResultSet.getString(9);
 if (resultObjString != null) {
   ge1801Array.setGe1801AFechaalta(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = curGe18ResultSet.getString(10);
 if (resultObjString != null) {
   ge1801Array.setGe1801AFechabaja(ftchRowCnt, resultObjString.toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = curGe18ResultSet.getString(11);
 if (resultObjString != null) {
   ge1801Array.setGe1801ACodnodo(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = curGe18ResultSet.getObject(12);
 if (resultObj != null) {
   ge1801Array.setGe1801AResambito(ftchRowCnt, resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = curGe18ResultSet.getObject(13);
 if (resultObj != null) {
   try {   
   ge1801Array.setGe1801ANumresamb(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        ge1801Array.setGe1801ANumresamb(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        ge1801Array.setGe1801ANumresamb(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        ge1801Array.setGe1801ANumresamb(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = curGe18ResultSet.getObject(14);
 if (resultObj != null) {
   try {   
   ge1801Array.setGe1801ANumpresamb(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        ge1801Array.setGe1801ANumpresamb(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        ge1801Array.setGe1801ANumpresamb(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        ge1801Array.setGe1801ANumpresamb(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObjString = curGe18ResultSet.getString(15);
 if (resultObjString != null) {
   ge1801Array.setGe1801ACengescapt(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = curGe18ResultSet.getObject(16);
 if (resultObj != null) {
   try {   
   ge1801Array.setGe1801ANumgescap(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        ge1801Array.setGe1801ANumgescap(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        ge1801Array.setGe1801ANumgescap(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        ge1801Array.setGe1801ANumgescap(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = curGe18ResultSet.getObject(17);
 if (resultObj != null) {
   try {   
   ge1801Array.setGe1801ANumpgescap(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        ge1801Array.setGe1801ANumpgescap(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        ge1801Array.setGe1801ANumpgescap(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        ge1801Array.setGe1801ANumpgescap(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = curGe18ResultSet.getObject(18);
 if (resultObj != null) {
   try {   
   ge1801Array.setGe1801ANumpesprie(ftchRowCnt,((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        ge1801Array.setGe1801ANumpesprie(ftchRowCnt,((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        ge1801Array.setGe1801ANumpesprie(ftchRowCnt,((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        ge1801Array.setGe1801ANumpesprie(ftchRowCnt,((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObjString = curGe18ResultSet.getString(19);
 if (resultObjString != null) {
   ge1801Array.setGe1801ACodcarrie(ftchRowCnt, db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObjString = curGe18ResultSet.getString(20);
 if (resultObjString != null) {
   ge1801Array.setGe1801AFecciecurso(ftchRowCnt, resultObjString.toCharArray() );
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
 		logger.error("curGe18ResultSet - Error during FETCH Cursor - {}",e.getMessage());
   		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
}
catch (Exception e) {
   throw e;
}
    }
// methodEnd:fetchCurGe18Bm80022
// methodStart:closeCurGe18Bm80022
    
/**
******     CLOSE CUR_GE18                                          
**/
    public void closeCurGe18Bm80022(Sqlca sqlca) throws Exception {


    sqlca.setSqlcode(0);
	db2Base.updateFetchCounter(sqlFetchCounter);
    }
// methodEnd:closeCurGe18Bm80022
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
