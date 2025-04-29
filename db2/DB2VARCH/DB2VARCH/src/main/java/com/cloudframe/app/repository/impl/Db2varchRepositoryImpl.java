package com.cloudframe.app.repository.impl;

import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.SQLS;
import com.cloudframe.app.dao.Db2Base;
import java.sql.Types;
import com.cloudframe.app.repository.Db2varchRepository;
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

import com.cloudframe.app.db2varch.dto.*;

@Repository
@Qualifier("db2varchRepository")
public class Db2varchRepositoryImpl implements Db2varchRepository {
    Logger logger = LoggerFactory.getLogger(Db2varchRepositoryImpl.class);

// declare:start
    static final short NOT_NULL = (short)0;
ResultSet resultSet = null;
// declare:end

    @Autowired
    @Qualifier("db2Base")
    SqlBase<char[]> db2Base;

// methodStart:updateBook
    
/**
******     UPDATE      BOOK                                        
******        SET PUBLISHED_DATE = :PUBLISHED-DATE :WS-DATE-NULL   
******        WHERE BOOK_ID = :BOOK-ID                             
**/
    public void updateBook(Nullvars nullvars, Dclbook dclbook, Sqlca sqlca) throws Exception {

try {
    // INSRT/UPDATE
    // reset SQLCODE
    sqlca.setSqlcode(0);
    // execute SQLJ query
    int count = db2Base.startQuery(3/* SQL Sequence*/,CONSTANTS.LITERAL_DB2VARCH)
    .withSql(SQLS.SQL_537847955)
				.withInputs(dclbook.getPublishedDate(),dclbook.getBookId())
				.withDataTypes(Types.VARCHAR,Types.INTEGER)
				.withNullIndicators(nullvars.getDateNull(),NOT_NULL)
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
// methodEnd:updateBook
// methodStart:deleteBook
    
/**
******     DELETE FROM BOOK                                        
******        WHERE BOOK_ID = :BOOK-ID                             
**/
    public void deleteBook(Dclbook dclbook, Sqlca sqlca) throws Exception {
try {
	// DELETE 
	// reset SQLCODE
	sqlca.setSqlcode(0);
	// execute SQLJ query
	int count = db2Base.startQuery(4/* SQL Sequence*/,CONSTANTS.LITERAL_DB2VARCH)
.withSql(SQLS.SQL_1085245666)
				.withInputs(dclbook.getBookId())
				.withDataTypes(Types.INTEGER)
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
// methodEnd:deleteBook
// methodStart:selectBook1
    
/**
******     SELECT                                                  
******            BOOK_ID                                          
******           ,ISBN                                             
******           ,PUBLISHED_DATE                                   
******           ,PUBLISHER_ID                                     
******           ,RATING                                           
******           ,TITLE                                            
******           ,TOTAL_PAGES                                      
******        INTO                                                 
******            :BOOK-ID                                         
******           ,:ISBN                                            
******           ,:PUBLISHED-DATE :WS-DATE-NULL                    
******           ,:PUBLISHER-ID                                    
******           ,:RATING :WS-RATE-NULL                            
******           ,:TITLE-GRP                                       
******           ,:TOTAL-PAGES                                     
******        FROM BOOK                                            
******        WHERE BOOK_ID = :BOOK-ID                             
**/
    public void selectBook1(Nullvars nullvars, Dclbook dclbook, Sqlca sqlca) throws Exception {
try {
	// SELECT 
	// reset SQLCODE
	sqlca.setSqlcode(0);

	// execute SQLJ query
	resultSet = db2Base.startQuery(5/* SQL Sequence*/, CONSTANTS.LITERAL_DB2VARCH)
.withSql(SQLS.SQL_120882561)
				.withInputs(dclbook.getBookId())
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
   try {   
   dclbook.setBookId(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dclbook.setBookId(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dclbook.setBookId(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dclbook.setBookId(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(2);
 if (resultObj != null) {
   try {   
   dclbook.setIsbn(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dclbook.setIsbn(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dclbook.setIsbn(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dclbook.setIsbn(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(3);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   dclbook.setPublishedDate( value,0, value.length,2,value.length);
   dclbook.getPublishedDate().setPublishedDateLen((short) value.length);
if (nullvars.getDateNull() != 0) nullvars.setDateNull( (short) 0);
 } else nullvars.setDateNull((short) -1 );
 resultObj = resultSet.getObject(4);
 if (resultObj != null) {
   try {   
   dclbook.setPublisherId(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dclbook.setPublisherId(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dclbook.setPublisherId(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dclbook.setPublisherId(((Double) resultObj).intValue());
   }
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(5);
 if (resultObj != null) {
   try {   
   nullvars.setRateNull( (short) 0);dclbook.setRating(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dclbook.setRating(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dclbook.setRating(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dclbook.setRating(((Double) resultObj).intValue());
   }
 } else {nullvars.setRateNull( (short) -1);
 }
 resultObj = resultSet.getObject(6);
 if (resultObj != null) {   
      value = resultObj.toString().toCharArray();  
   dclbook.setTitleGrp( value,0, value.length,2,value.length);
   dclbook.getTitleGrp().setTitleLen((short) value.length);
} else {sqlca.setSqlcode(-305); }
 resultObj = resultSet.getObject(7);
 if (resultObj != null) {
   try {   
   dclbook.setTotalPages(((Integer) resultObj).intValue());
   } catch(java.lang.ClassCastException cce) {  
     if(BigDecimal.class.isInstance(resultObj))
        dclbook.setTotalPages(((BigDecimal) resultObj).intValue());
     else if(Float.class.isInstance(resultObj))
        dclbook.setTotalPages(((Float) resultObj).intValue());
     else if(Double.class.isInstance(resultObj))
        dclbook.setTotalPages(((Double) resultObj).intValue());
   }
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
// methodEnd:selectBook1
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
