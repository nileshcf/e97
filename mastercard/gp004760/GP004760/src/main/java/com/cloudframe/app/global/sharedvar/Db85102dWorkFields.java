package com.cloudframe.app.global.sharedvar;

/**
*  The class Db85102dWorkFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:57. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class Db85102dWorkFields extends Db85102dWorkFieldsSerialized { 
   

						private char[] db85102dConnectStatusMap = Field.fillLowValue(5);

						private char[] db85102dCurrCollId = Field.fillLowValue(18);

						private char[] db85102dTempCollId = Field.fillLowValue(18);

						private char[] db85102dPrevCollId = Field.fillLowValue(18);

						private char[] db85102dDb2CurrServer = Field.fillLowValue(16);

						private char[] db85102dDb2User = Field.fillLowValue(8);

						private char[] db85102dDb2CurrSqlid = Field.fillLowValue(8);

						private char[] db85102dDb2cloneStatus = Field.fillLowValue(2);
	
	/**
	* Constructor for Db85102dWorkFields
	**/
    public Db85102dWorkFields() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of db85102dConnectStatusMap
	 *	@return db85102dConnectStatusMap
	 */
   public char[] getDb85102dConnectStatusMap() throws CFException{
     if (isDb85102dConnectStatusMapModified()) { 
        db85102dConnectStatusMap = refreshDb85102dConnectStatusMap();
     }
   		return db85102dConnectStatusMap;
   }

  
	/**
	*  set variable db85102dConnectStatusMap
	*  Corresponding COBOL Variable is DB85102D-CONNECT-STATUS-MAP
	*  @param value
	**/
   public void setDb85102dConnectStatusMap(char[] value) {
      db85102dConnectStatusMap = checkDb85102dConnectStatusMapConstraints(value);
      serializeDb85102dConnectStatusMap(db85102dConnectStatusMap);
   } 

     /**
	 * 	Update Db85102dConnectStatusMap 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dConnectStatusMap(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDb85102dConnectStatusMap,db85102dConnectStatusMap.length);
   	
   }
   
   public void setDb85102dConnectStatusMap(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dConnectStatusMap,db85102dConnectStatusMap.length);
   	
   }
   
     /**
	 * 	Update Db85102dConnectStatusMap 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dConnectStatusMap(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dConnectStatusMap+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Db85102dConnectStatusMap with another Field
	 *	@param value
	 */
   public void setDb85102dConnectStatusMap(Field source) {
       replace(source,0,source.length(),beginDb85102dConnectStatusMap,DB_85102D_CONNECT_STATUS_MAP_LEN);
   	
   }  
   
     /**
	 * 	Update Db85102dConnectStatusMap 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dConnectStatusMap(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDb85102dConnectStatusMap,DB_85102D_CONNECT_STATUS_MAP_LEN);
   	
   }
   
     /**
	 * 	Update Db85102dConnectStatusMap 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dConnectStatusMap(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dConnectStatusMap+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of db85102dCurrCollId
	 *	@return db85102dCurrCollId
	 */
   public char[] getDb85102dCurrCollId() throws CFException{
     if (isDb85102dCurrCollIdModified()) { 
        db85102dCurrCollId = refreshDb85102dCurrCollId();
     }
   		return db85102dCurrCollId;
   }

  
	/**
	*  set variable db85102dCurrCollId
	*  Corresponding COBOL Variable is DB85102D-CURR-COLL-ID
	*  @param value
	**/
   public void setDb85102dCurrCollId(char[] value) {
      db85102dCurrCollId = checkDb85102dCurrCollIdConstraints(value);
      serializeDb85102dCurrCollId(db85102dCurrCollId);
   } 

     /**
	 * 	Update Db85102dCurrCollId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dCurrCollId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDb85102dCurrCollId,db85102dCurrCollId.length);
   	
   }
   
   public void setDb85102dCurrCollId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dCurrCollId,db85102dCurrCollId.length);
   	
   }
   
     /**
	 * 	Update Db85102dCurrCollId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dCurrCollId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dCurrCollId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Db85102dCurrCollId with another Field
	 *	@param value
	 */
   public void setDb85102dCurrCollId(Field source) {
       replace(source,0,source.length(),beginDb85102dCurrCollId,DB_85102D_CURR_COLL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Db85102dCurrCollId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dCurrCollId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDb85102dCurrCollId,DB_85102D_CURR_COLL_ID_LEN);
   	
   }
   
     /**
	 * 	Update Db85102dCurrCollId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dCurrCollId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dCurrCollId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of db85102dTempCollId
	 *	@return db85102dTempCollId
	 */
   public char[] getDb85102dTempCollId() throws CFException{
     if (isDb85102dTempCollIdModified()) { 
        db85102dTempCollId = refreshDb85102dTempCollId();
     }
   		return db85102dTempCollId;
   }

  
	/**
	*  set variable db85102dTempCollId
	*  Corresponding COBOL Variable is DB85102D-TEMP-COLL-ID
	*  @param value
	**/
   public void setDb85102dTempCollId(char[] value) {
      db85102dTempCollId = checkDb85102dTempCollIdConstraints(value);
      serializeDb85102dTempCollId(db85102dTempCollId);
   } 

     /**
	 * 	Update Db85102dTempCollId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dTempCollId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDb85102dTempCollId,db85102dTempCollId.length);
   	
   }
   
   public void setDb85102dTempCollId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dTempCollId,db85102dTempCollId.length);
   	
   }
   
     /**
	 * 	Update Db85102dTempCollId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dTempCollId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dTempCollId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Db85102dTempCollId with another Field
	 *	@param value
	 */
   public void setDb85102dTempCollId(Field source) {
       replace(source,0,source.length(),beginDb85102dTempCollId,DB_85102D_TEMP_COLL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Db85102dTempCollId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dTempCollId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDb85102dTempCollId,DB_85102D_TEMP_COLL_ID_LEN);
   	
   }
   
     /**
	 * 	Update Db85102dTempCollId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dTempCollId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dTempCollId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of db85102dPrevCollId
	 *	@return db85102dPrevCollId
	 */
   public char[] getDb85102dPrevCollId() throws CFException{
     if (isDb85102dPrevCollIdModified()) { 
        db85102dPrevCollId = refreshDb85102dPrevCollId();
     }
   		return db85102dPrevCollId;
   }

  
	/**
	*  set variable db85102dPrevCollId
	*  Corresponding COBOL Variable is DB85102D-PREV-COLL-ID
	*  @param value
	**/
   public void setDb85102dPrevCollId(char[] value) {
      db85102dPrevCollId = checkDb85102dPrevCollIdConstraints(value);
      serializeDb85102dPrevCollId(db85102dPrevCollId);
   } 

     /**
	 * 	Update Db85102dPrevCollId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dPrevCollId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDb85102dPrevCollId,db85102dPrevCollId.length);
   	
   }
   
   public void setDb85102dPrevCollId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dPrevCollId,db85102dPrevCollId.length);
   	
   }
   
     /**
	 * 	Update Db85102dPrevCollId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dPrevCollId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dPrevCollId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Db85102dPrevCollId with another Field
	 *	@param value
	 */
   public void setDb85102dPrevCollId(Field source) {
       replace(source,0,source.length(),beginDb85102dPrevCollId,DB_85102D_PREV_COLL_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Db85102dPrevCollId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dPrevCollId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDb85102dPrevCollId,DB_85102D_PREV_COLL_ID_LEN);
   	
   }
   
     /**
	 * 	Update Db85102dPrevCollId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dPrevCollId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dPrevCollId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of db85102dDb2CurrServer
	 *	@return db85102dDb2CurrServer
	 */
   public char[] getDb85102dDb2CurrServer() throws CFException{
     if (isDb85102dDb2CurrServerModified()) { 
        db85102dDb2CurrServer = refreshDb85102dDb2CurrServer();
     }
   		return db85102dDb2CurrServer;
   }

  
	/**
	*  set variable db85102dDb2CurrServer
	*  Corresponding COBOL Variable is DB85102D-DB2-CURR-SERVER
	*  @param value
	**/
   public void setDb85102dDb2CurrServer(char[] value) {
      db85102dDb2CurrServer = checkDb85102dDb2CurrServerConstraints(value);
      serializeDb85102dDb2CurrServer(db85102dDb2CurrServer);
   } 

     /**
	 * 	Update Db85102dDb2CurrServer 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dDb2CurrServer(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDb85102dDb2CurrServer,db85102dDb2CurrServer.length);
   	
   }
   
   public void setDb85102dDb2CurrServer(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dDb2CurrServer,db85102dDb2CurrServer.length);
   	
   }
   
     /**
	 * 	Update Db85102dDb2CurrServer 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2CurrServer(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dDb2CurrServer+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Db85102dDb2CurrServer with another Field
	 *	@param value
	 */
   public void setDb85102dDb2CurrServer(Field source) {
       replace(source,0,source.length(),beginDb85102dDb2CurrServer,DB_85102D_DB_2_CURR_SERVER_LEN);
   	
   }  
   
     /**
	 * 	Update Db85102dDb2CurrServer 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dDb2CurrServer(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDb85102dDb2CurrServer,DB_85102D_DB_2_CURR_SERVER_LEN);
   	
   }
   
     /**
	 * 	Update Db85102dDb2CurrServer 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2CurrServer(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dDb2CurrServer+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of db85102dDb2User
	 *	@return db85102dDb2User
	 */
   public char[] getDb85102dDb2User() throws CFException{
     if (isDb85102dDb2UserModified()) { 
        db85102dDb2User = refreshDb85102dDb2User();
     }
   		return db85102dDb2User;
   }

  
	/**
	*  set variable db85102dDb2User
	*  Corresponding COBOL Variable is DB85102D-DB2-USER
	*  @param value
	**/
   public void setDb85102dDb2User(char[] value) {
      db85102dDb2User = checkDb85102dDb2UserConstraints(value);
      serializeDb85102dDb2User(db85102dDb2User);
   } 

     /**
	 * 	Update Db85102dDb2User 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dDb2User(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDb85102dDb2User,db85102dDb2User.length);
   	
   }
   
   public void setDb85102dDb2User(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dDb2User,db85102dDb2User.length);
   	
   }
   
     /**
	 * 	Update Db85102dDb2User 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2User(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dDb2User+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Db85102dDb2User with another Field
	 *	@param value
	 */
   public void setDb85102dDb2User(Field source) {
       replace(source,0,source.length(),beginDb85102dDb2User,DB_85102D_DB_2_USER_LEN);
   	
   }  
   
     /**
	 * 	Update Db85102dDb2User 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dDb2User(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDb85102dDb2User,DB_85102D_DB_2_USER_LEN);
   	
   }
   
     /**
	 * 	Update Db85102dDb2User 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2User(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dDb2User+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of db85102dDb2CurrSqlid
	 *	@return db85102dDb2CurrSqlid
	 */
   public char[] getDb85102dDb2CurrSqlid() throws CFException{
     if (isDb85102dDb2CurrSqlidModified()) { 
        db85102dDb2CurrSqlid = refreshDb85102dDb2CurrSqlid();
     }
   		return db85102dDb2CurrSqlid;
   }

  
	/**
	*  set variable db85102dDb2CurrSqlid
	*  Corresponding COBOL Variable is DB85102D-DB2-CURR-SQLID
	*  @param value
	**/
   public void setDb85102dDb2CurrSqlid(char[] value) {
      db85102dDb2CurrSqlid = checkDb85102dDb2CurrSqlidConstraints(value);
      serializeDb85102dDb2CurrSqlid(db85102dDb2CurrSqlid);
   } 

     /**
	 * 	Update Db85102dDb2CurrSqlid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dDb2CurrSqlid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDb85102dDb2CurrSqlid,db85102dDb2CurrSqlid.length);
   	
   }
   
   public void setDb85102dDb2CurrSqlid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dDb2CurrSqlid,db85102dDb2CurrSqlid.length);
   	
   }
   
     /**
	 * 	Update Db85102dDb2CurrSqlid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2CurrSqlid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dDb2CurrSqlid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Db85102dDb2CurrSqlid with another Field
	 *	@param value
	 */
   public void setDb85102dDb2CurrSqlid(Field source) {
       replace(source,0,source.length(),beginDb85102dDb2CurrSqlid,DB_85102D_DB_2_CURR_SQLID_LEN);
   	
   }  
   
     /**
	 * 	Update Db85102dDb2CurrSqlid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dDb2CurrSqlid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDb85102dDb2CurrSqlid,DB_85102D_DB_2_CURR_SQLID_LEN);
   	
   }
   
     /**
	 * 	Update Db85102dDb2CurrSqlid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2CurrSqlid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dDb2CurrSqlid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of db85102dDb2cloneStatus
	 *	@return db85102dDb2cloneStatus
	 */
   public char[] getDb85102dDb2cloneStatus() throws CFException{
     if (isDb85102dDb2cloneStatusModified()) { 
        db85102dDb2cloneStatus = refreshDb85102dDb2cloneStatus();
     }
   		return db85102dDb2cloneStatus;
   }

  
	/**
	*  set variable db85102dDb2cloneStatus
	*  Corresponding COBOL Variable is DB85102D-DB2CLONE-STATUS
	*  @param value
	**/
   public void setDb85102dDb2cloneStatus(char[] value) {
      db85102dDb2cloneStatus = checkDb85102dDb2cloneStatusConstraints(value);
      serializeDb85102dDb2cloneStatus(db85102dDb2cloneStatus);
   } 

     /**
	 * 	Update Db85102dDb2cloneStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDb85102dDb2cloneStatus,db85102dDb2cloneStatus.length);
   	
   }
   
   public void setDb85102dDb2cloneStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dDb2cloneStatus,db85102dDb2cloneStatus.length);
   	
   }
   
     /**
	 * 	Update Db85102dDb2cloneStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dDb2cloneStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Db85102dDb2cloneStatus with another Field
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(Field source) {
       replace(source,0,source.length(),beginDb85102dDb2cloneStatus,DB_85102D_DB_2CLONE_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Db85102dDb2cloneStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDb85102dDb2cloneStatus,DB_85102D_DB_2CLONE_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Db85102dDb2cloneStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDb85102dDb2cloneStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDb85102dDb2cloneStatus+targetIndex,targetLen);
    
   }
	char[] db85102dDb2cloneIoGood8888Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isDb85102dDb2cloneIoGood88()
	 *	@return  Returns true if isDb85102dDb2cloneIoGood88() is "00"
	 */
   public boolean isDb85102dDb2cloneIoGood88() throws CFException {
      return (  compareChars( getDb85102dDb2cloneStatus() , db85102dDb2cloneIoGood8888Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setDb85102dDb2cloneIoGood88True() {  			
    	setDb85102dDb2cloneStatus( db85102dDb2cloneIoGood8888Value);
   	}
	char[] db85102dDb2cloneEof8888Value = "10".toCharArray();
	/**
	 *	Test condition "10" for isDb85102dDb2cloneEof88()
	 *	@return  Returns true if isDb85102dDb2cloneEof88() is "10"
	 */
   public boolean isDb85102dDb2cloneEof88() throws CFException {
      return (  compareChars( getDb85102dDb2cloneStatus() , db85102dDb2cloneEof8888Value)  == 0  );
   }


	/**
	*  set values "10"
	*/
   	public void setDb85102dDb2cloneEof88True() {  			
    	setDb85102dDb2cloneStatus( db85102dDb2cloneEof8888Value);
   	}

	
	
	
	/**
	 * 	initializes Db85102dWorkFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setDb85102dConnectStatusMap(CONSTANTS.SPACE_5);
         setDb85102dCurrCollId(CONSTANTS.SPACE_18);
         setDb85102dTempCollId(CONSTANTS.SPACE_18);
         setDb85102dPrevCollId(CONSTANTS.SPACE_18);
         setDb85102dDb2CurrServer(CONSTANTS.SPACE_16);
         setDb85102dDb2User(CONSTANTS.SPACE_8);
         setDb85102dDb2CurrSqlid(CONSTANTS.SPACE_8);
         setDb85102dDb2cloneStatus(CONSTANTS.SPACE_2);
   }

		public static int getDb85102dWorkFieldsFieldLength() {
			return DB_85102D_WORK_FIELDS_LENGTH;
		}

}
  
