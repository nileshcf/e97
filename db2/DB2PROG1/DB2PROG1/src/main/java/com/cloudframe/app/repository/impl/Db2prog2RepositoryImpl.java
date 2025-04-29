package com.cloudframe.app.repository.impl;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.repository.Db2prog2Repository;
import com.cloudframe.app.dao.Db2Base;
import java.sql.Types;
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

import com.cloudframe.app.db2prog2.dto.*;

@Repository
@Qualifier("db2prog2Repository")
public class Db2prog2RepositoryImpl implements Db2prog2Repository {
    Logger logger = LoggerFactory.getLogger(Db2prog2RepositoryImpl.class);

// declare:start
    int sqlFetchCounter = 0;
static final short NOT_NULL = (short)0;
ResultSet resultSet = null;
ResultSet widgetResultSet = null;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:selectBooks
    
/**
******     SELECT   RTRIM(TITLE)                                   
******       INTO   :BOOKS-TITLE                                   
******       FROM   BOOKS                                          
******      WHERE   BOOK_ID = :BOOKS-BOOK-ID                       
**/
    public void selectBooks(Sqlca sqlca, Dclbooks dclbooks) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(3/* SQL Sequence*/, CONSTANTS.LITERAL_DB2PROG2)
.withSql(SQLS.SQL_1525192811)
				.withInputs(dclbooks.getBooksBookId())
				.withDataTypes(Types.INTEGER)
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
      value = resultObj.toString().toCharArray();  
   dclbooks.setBooksTitle( value,0, value.length,2,value.length);
   dclbooks.getBooksTitle().setBooksTitleLen((short) value.length);
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
// methodEnd:selectBooks
// methodStart:insertTbwidget
    
/**
******     INSERT INTO TBWIDGET                                    
******        (                                                    
******            WIDGET_NUM,                                      
******            WIDGET_COLOR,                                    
******            WIDGET_SIZE,                                     
******            WIDGET_PRICE,                                    
******            WIDGET_SUPPLIER,                                 
******            WIDGET_DESC,                                     
******            WIDGET_MANU_PLANT,                               
******            WIDGET_MANU_COST,                                
******            WIDGET_LEAD_TIME                                 
******        )                                                    
******        VALUES                                               
******        (                                                    
******            :WIDGET-NUM,                                     
******            :WIDGET-COLOR,                                   
******            :WIDGET-SIZE,                                    
******            :WIDGET-PRICE,                                   
******            :WIDGET-SUPPLIER,                                
******            :WIDGET-DESC,                                    
******            :WIDGET-MANU-PLANT,                              
******            :WIDGET-MANU-COST,                               
******            :WIDGET-LEAD-TIME                                
******        )                                                    
**/
    public void insertTbwidget(Sqlca sqlca, Tbwidget tbwidget) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(4/* SQL Sequence*/,CONSTANTS.LITERAL_DB2PROG2)
    .withSql(SQLS.SQL_387013203)
				.withInputs(tbwidget.getWidgetNum(),tbwidget.getWidgetColor(),tbwidget.getWidgetSize(),tbwidget.getWidgetPrice(),tbwidget.getWidgetSupplier(),tbwidget.getWidgetDesc(),tbwidget.getWidgetManuPlant(),tbwidget.getWidgetManuCost(),tbwidget.getWidgetLeadTime())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.CHAR,Types.DECIMAL,Types.CHAR,Types.CHAR,Types.CHAR,Types.DECIMAL,Types.SMALLINT)
    .executeUpdate();
    
    sqlca.setSqlerrd(2,count);
   }
    catch (SQLException e) {
            fillSqlcaObject(sqlca, e);
    }
    catch(Exception e) {
    throw e;
    }
    }
// methodEnd:insertTbwidget
// methodStart:updateTbwidget
    
/**
******     UPDATE TBWIDGET                                         
******        SET                                                  
******            WIDGET_COLOR      = :WIDGET-COLOR,               
******            WIDGET_SIZE       = :WIDGET-SIZE,                
******            WIDGET_PRICE      = :WIDGET-PRICE,               
******            WIDGET_SUPPLIER   = :WIDGET-SUPPLIER,            
******            WIDGET_DESC       = :WIDGET-DESC                 
******      WHERE WIDGET_NUM = :WIDGET-NUM                         
**/
    public void updateTbwidget(Sqlca sqlca, Tbwidget tbwidget) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(6/* SQL Sequence*/,CONSTANTS.LITERAL_DB2PROG2)
    .withSql(SQLS.SQL_1981760060)
				.withInputs(tbwidget.getWidgetColor(),tbwidget.getWidgetSize(),tbwidget.getWidgetPrice(),tbwidget.getWidgetSupplier(),tbwidget.getWidgetDesc(),tbwidget.getWidgetNum())
				.withDataTypes(Types.CHAR,Types.CHAR,Types.DECIMAL,Types.CHAR,Types.CHAR,Types.CHAR)
    .executeUpdate();
    if(count == 0) {
	sqlca.setSqlcode(100);
}

    sqlca.setSqlerrd(2,count);
   }
    catch (SQLException e) {
            fillSqlcaObject(sqlca, e);
    }
    catch(Exception e) {
    throw e;
    }
    }
// methodEnd:updateTbwidget
// methodStart:openWidgetDb2prog2
    
/**
******   DECLARE WIDGET CURSOR FOR                                 
******     SELECT WIDGET_NUM,                                      
******            WIDGET_COLOR,                                    
******            WIDGET_SIZE,                                     
******            WIDGET_PRICE,                                    
******            WIDGET_SUPPLIER,                                 
******            WIDGET_DESC,                                     
******            WIDGET_MANU_PLANT,                               
******            WIDGET_MANU_COST,                                
******            WIDGET_LEAD_TIME                                 
******       FROM TBWIDGET                                         
******      ORDER BY WIDGET_NUM                                    
******     FOR FETCH ONLY                                          
**/
    public void openWidgetDb2prog2(Sqlca sqlca) throws Exception {

try {
	//OPEN CURSOR
	sqlca.setSqlcode(0);
	widgetResultSet = db2Base.startQuery(2/* SQL Sequence*/, CONSTANTS.LITERAL_DB2PROG2)
    .withSql(SQLS.SQL_1690156902)
		.queryForList();
}
catch(SQLException e){
		fillSqlcaObject(sqlca, e);
}
catch(Exception e){
		throw e;
}


    }
// methodEnd:openWidgetDb2prog2
// methodStart:fetchWidgetDb2prog2
    
/**
******        FETCH WIDGET                                         
******        INTO :WIDGET-NUM,                                    
******             :WIDGET-COLOR,                                  
******             :WIDGET-SIZE,                                   
******             :WIDGET-PRICE,                                  
******             :WIDGET-SUPPLIER,                               
******             :WIDGET-DESC,                                   
******             :WIDGET-MANU-PLANT,                             
******             :WIDGET-MANU-COST,                              
******             :WIDGET-LEAD-TIME                               
**/
    public void fetchWidgetDb2prog2(Sqlca sqlca, Tbwidget tbwidget) throws Exception {
try {
	boolean hasResults = widgetResultSet.next();
	if (hasResults) {
		sqlca.setSqlcode(0);

	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObjString = widgetResultSet.getString(1);
 if (resultObjString != null) {
   tbwidget.setWidgetNum( db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = widgetResultSet.getObject(2);
 if (resultObj != null) {
   tbwidget.setWidgetColor( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = widgetResultSet.getObject(3);
 if (resultObj != null) {
   tbwidget.setWidgetSize( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = widgetResultSet.getObject(4);
 if (resultObj != null) {
   try {   
   tbwidget.setWidgetPrice( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        tbwidget.setWidgetPrice( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        tbwidget.setWidgetPrice( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        tbwidget.setWidgetPrice( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObjString = widgetResultSet.getString(5);
 if (resultObjString != null) {
   tbwidget.setWidgetSupplier( db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = widgetResultSet.getObject(6);
 if (resultObj != null) {
   tbwidget.setWidgetDesc( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = widgetResultSet.getString(7);
 if (resultObjString != null) {
   tbwidget.setWidgetManuPlant( db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = widgetResultSet.getObject(8);
 if (resultObj != null) {
   try {   
   tbwidget.setWidgetManuCost( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        tbwidget.setWidgetManuCost( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        tbwidget.setWidgetManuCost( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        tbwidget.setWidgetManuCost( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = widgetResultSet.getObject(9);
 if (resultObj != null) {
   tbwidget.setWidgetLeadTime((short) ((Integer) resultObj ).intValue());
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
 		logger.error("widgetResultSet - Error during FETCH Cursor - {}",e.getMessage());
 		sqlca.setSqlcode(-904); // //possibly a data issue
   	}
	System.out.println(e.getMessage());
}
    }
// methodEnd:fetchWidgetDb2prog2
// methodStart:closeWidgetDb2prog2
    
/**
******     CLOSE WIDGET                                            
**/
    public void closeWidgetDb2prog2(Sqlca sqlca) throws Exception {


    sqlca.setSqlcode(0);
	db2Base.updateFetchCounter(sqlFetchCounter);
    }
// methodEnd:closeWidgetDb2prog2
// methodStart:deleteTbwidget
    
/**
******     DELETE FROM TBWIDGET                                    
******      WHERE WIDGET_NUM = :WIDGET-NUM                         
**/
    public void deleteTbwidget(Sqlca sqlca, Tbwidget tbwidget) throws Exception {
try {
	// DELETE 
	// reset SQLCODE
	sqlca.setSqlcode(0);
	// execute SQLJ query
	int count = db2Base.startQuery(11/* SQL Sequence*/,CONSTANTS.LITERAL_DB2PROG2)
.withSql(SQLS.SQL_1019870537)
				.withInputs(tbwidget.getWidgetNum())
				.withDataTypes(Types.CHAR)
		.executeUpdate(); 
	if(count == 0) {
	sqlca.setSqlcode(100);
}

	sqlca.setSqlerrd(2,count);
}
catch (SQLException e) {
			fillSqlcaObject(sqlca, e);
}
catch(Exception e) {
	throw e;
}
    }
// methodEnd:deleteTbwidget
// methodStart:selectTbwidget
    
/**
******     SELECT WIDGET_NUM,                                      
******            WIDGET_COLOR,                                    
******            WIDGET_SIZE,                                     
******            WIDGET_PRICE,                                    
******            WIDGET_SUPPLIER,                                 
******            WIDGET_DESC,                                     
******            WIDGET_MANU_PLANT,                               
******            WIDGET_MANU_COST,                                
******            WIDGET_LEAD_TIME                                 
******     INTO  :WIDGET-NUM,                                      
******           :WIDGET-COLOR,                                    
******           :WIDGET-SIZE,                                     
******           :WIDGET-PRICE,                                    
******           :WIDGET-SUPPLIER,                                 
******           :WIDGET-DESC,                                     
******           :WIDGET-MANU-PLANT,                               
******           :WIDGET-MANU-COST,                                
******           :WIDGET-LEAD-TIME                                 
******       FROM TBWIDGET                                         
******      WHERE WIDGET_NUM = :WIDGET-NUM                         
**/
    public void selectTbwidget(Sqlca sqlca, Tbwidget tbwidget) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(13/* SQL Sequence*/, CONSTANTS.LITERAL_DB2PROG2)
.withSql(SQLS.SQL_1006270253)
				.withInputs(tbwidget.getWidgetNum())
				.withDataTypes(Types.CHAR)
	.queryForList();
	// check sqlca.getSqlcode() or errors
	sqlca.setSqlcode(Db2Base.fillSQLCode(resultSet));
	if (sqlca.getSqlcode() != 100) {
	// Extract values from the result set 
 Object resultObj;
 String resultObjString = null;
 char[] value;
 resultObjString = resultSet.getString(1);
 if (resultObjString != null) {
   tbwidget.setWidgetNum( db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(2);
 if (resultObj != null) {
   tbwidget.setWidgetColor( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(3);
 if (resultObj != null) {
   tbwidget.setWidgetSize( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(4);
 if (resultObj != null) {
   try {   
   tbwidget.setWidgetPrice( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        tbwidget.setWidgetPrice( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        tbwidget.setWidgetPrice( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        tbwidget.setWidgetPrice( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(5);
 if (resultObjString != null) {
   tbwidget.setWidgetSupplier( db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(6);
 if (resultObj != null) {
   tbwidget.setWidgetDesc( resultObj.toString().toCharArray() );
} else {sqlca.setSqlcode(-305); }
 resultObjString = resultSet.getString(7);
 if (resultObjString != null) {
   tbwidget.setWidgetManuPlant( db2Base.formatISOTime(resultObjString) );
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(8);
 if (resultObj != null) {
   try {   
   tbwidget.setWidgetManuCost( (Db2Base.castToBigDecimal(resultObj)));
   } catch(java.lang.ClassCastException cce) {  
     if(Integer.class.isInstance(resultObj))
        tbwidget.setWidgetManuCost( BigDecimal.valueOf((Integer)resultObj));
     else if(Float.class.isInstance(resultObj))
        tbwidget.setWidgetManuCost( new BigDecimal((Float)resultObj, MathContext.DECIMAL32));
     else if(Double.class.isInstance(resultObj))
        tbwidget.setWidgetManuCost( new BigDecimal((Double)resultObj, MathContext.DECIMAL64));
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(9);
 if (resultObj != null) {
   tbwidget.setWidgetLeadTime((short) ((Integer) resultObj ).intValue());
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
// methodEnd:selectTbwidget
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
