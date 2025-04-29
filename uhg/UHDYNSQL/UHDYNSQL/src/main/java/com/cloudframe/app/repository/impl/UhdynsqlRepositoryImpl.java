package com.cloudframe.app.repository.impl;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.dao.Db2Base;
import java.sql.Types;
import java.math.MathContext;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.repository.UhdynsqlRepository;
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

import com.cloudframe.app.uhdynsql.dto.*;

@Repository
@Qualifier("uhdynsqlRepository")
public class UhdynsqlRepositoryImpl implements UhdynsqlRepository {
    Logger logger = LoggerFactory.getLogger(UhdynsqlRepositoryImpl.class);

// declare:start
    int sqlFetchCounter = 0;
ResultSet widgetCsrResultSet = null;
static final short NOT_NULL = (short)0;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:prepare
    
/**
******     PREPARE WIDGTQRY FROM :WQ-SQL-FULL-CLAUSE               
**/
    public void prepare(Sqlca sqlca, WqSqlFullClause wqSqlFullClause) throws Exception {

try {
	//PREPARE
	sqlca.setSqlcode(0);
	int len = wqSqlFullClause.getShort(0);
    char[] sql = new char[len];
    System.arraycopy(wqSqlFullClause.toCharArray(), 2, sql, 0, len);
     db2Base.sqlPrepare(  new String(sql),"WIDGTQRY",CONSTANTS.LITERAL_UHDYNSQL);
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}


    }
// methodEnd:prepare
// methodStart:openWidgetCsrUhdynsql
    
/**
******     DECLARE WIDGET-CSR CURSOR FOR WIDGTQRY                  
**/
    public void openWidgetCsrUhdynsql(Field sqlda, Sqlca sqlca) throws Exception {

try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
    widgetCsrResultSet = db2Base.sqlOpen("WIDGTQRY",CONSTANTS.LITERAL_UHDYNSQL, sqlda);
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}


    }
// methodEnd:openWidgetCsrUhdynsql
// methodStart:fetchWidgetCsrUhdynsql
    
/**
******     FETCH   WIDGET-CSR                                      
******     INTO   :WIDGET-NUM                                      
******           ,:WIDGET-COLOR                                    
******           ,:WIDGET-SIZE                                     
******           ,:WIDGET-PRICE                                    
******           ,:WIDGET-SUPPLIER                                 
******           ,:WIDGET-DESC                                     
******           ,:WIDGET-MANU-PLANT                               
******           ,:WIDGET-MANU-COST                                
******           ,:WIDGET-LEAD-TIME                                
**/
    public void fetchWidgetCsrUhdynsql(Sqlca sqlca, Tbxmlwgt tbxmlwgt) throws Exception {
try {
	boolean hasResults = widgetCsrResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObjString = widgetCsrResultSet.getString(1);
 if (resultObjString != null) {
   tbxmlwgt.setWidgetNum( db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = widgetCsrResultSet.getObject(2);
 if (resultObj != null) {
   tbxmlwgt.setWidgetColor( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = widgetCsrResultSet.getObject(3);
 if (resultObj != null) {
   tbxmlwgt.setWidgetSize( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = widgetCsrResultSet.getObject(4);
 if (resultObj != null) {
   try {   
   tbxmlwgt.setWidgetPrice( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        tbxmlwgt.setWidgetPrice( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        tbxmlwgt.setWidgetPrice( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        tbxmlwgt.setWidgetPrice( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObjString = widgetCsrResultSet.getString(5);
 if (resultObjString != null) {
   tbxmlwgt.setWidgetSupplier( db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = widgetCsrResultSet.getObject(6);
 if (resultObj != null) {
   tbxmlwgt.setWidgetDesc( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = widgetCsrResultSet.getString(7);
 if (resultObjString != null) {
   tbxmlwgt.setWidgetManuPlant( db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = widgetCsrResultSet.getObject(8);
 if (resultObj != null) {
   try {   
   tbxmlwgt.setWidgetManuCost( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        tbxmlwgt.setWidgetManuCost( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        tbxmlwgt.setWidgetManuCost( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        tbxmlwgt.setWidgetManuCost( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = widgetCsrResultSet.getObject(9);
 if (resultObj != null) {
   tbxmlwgt.setWidgetLeadTime((short) ((Integer) resultObj ).intValue());
} else {sqlca.setSqlcode(-305); }
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
 		logger.error("widgetCsrResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchWidgetCsrUhdynsql
// methodStart:closeWidgetCsrUhdynsql
    
/**
******    CLOSE  WIDGET-CSR                                        
**/
    public void closeWidgetCsrUhdynsql(Sqlca sqlca) throws Exception {


    sqlca.setSqlcode(0);
	db2Base.updateFetchCounter(sqlFetchCounter);
    }
// methodEnd:closeWidgetCsrUhdynsql
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
