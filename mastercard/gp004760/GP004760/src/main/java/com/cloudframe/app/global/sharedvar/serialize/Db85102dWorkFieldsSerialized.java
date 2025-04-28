package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Db85102dWorkFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Db85102dWorkFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Db85102dWorkFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DB_85102D_WORK_FIELDS_LENGTH = 93;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDb85102dConnectStatusMap;
            protected  int beginDb85102dCurrCollId;
            protected  int beginDb85102dTempCollId;
            protected  int beginDb85102dPrevCollId;
            protected  int beginDb85102dDb2CurrServer;
            protected  int beginDb85102dDb2User;
            protected  int beginDb85102dDb2CurrSqlid;
            protected  int beginDb85102dDb2cloneStatus;
	
	/**
	* Constructor for Db85102dWorkFieldsSerialized
	**/
    public Db85102dWorkFieldsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Db85102dWorkFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DB_85102D_WORK_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDb85102dConnectStatusMap = getStartOffset() + 0;	// set offset for serialization
  
             beginDb85102dCurrCollId = getStartOffset() + 5;	// set offset for serialization
  
             beginDb85102dTempCollId = getStartOffset() + 23;	// set offset for serialization
  
             beginDb85102dPrevCollId = getStartOffset() + 41;	// set offset for serialization
  
             beginDb85102dDb2CurrServer = getStartOffset() + 59;	// set offset for serialization
  
             beginDb85102dDb2User = getStartOffset() + 75;	// set offset for serialization
  
             beginDb85102dDb2CurrSqlid = getStartOffset() + 83;	// set offset for serialization
  
             beginDb85102dDb2cloneStatus = getStartOffset() + 91;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDb85102dConnectStatusMapCounter = -1;
     public boolean isDb85102dConnectStatusMapModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb85102dConnectStatusMapCounter != sharedCounter;
         localDb85102dConnectStatusMapCounter = sharedCounter; return hasModified;
     }
	protected static final int DB_85102D_CONNECT_STATUS_MAP_LEN = 5;
	/**
	 * 	serialize this Db85102dConnectStatusMap
	 */
   protected void serializeDb85102dConnectStatusMap(char[] db85102dConnectStatusMap) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(db85102dConnectStatusMap,0,getStringValue(),beginDb85102dConnectStatusMap,DB_85102D_CONNECT_STATUS_MAP_LEN);
       localDb85102dConnectStatusMapCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDb85102dConnectStatusMapConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshDb85102dConnectStatusMap is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDb85102dConnectStatusMap() {	 
   		return (substring(getStringValue(),beginDb85102dConnectStatusMap,beginDb85102dConnectStatusMap + DB_85102D_CONNECT_STATUS_MAP_LEN));
   	}
     int localDb85102dCurrCollIdCounter = -1;
     public boolean isDb85102dCurrCollIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb85102dCurrCollIdCounter != sharedCounter;
         localDb85102dCurrCollIdCounter = sharedCounter; return hasModified;
     }
	protected static final int DB_85102D_CURR_COLL_ID_LEN = 18;
	/**
	 * 	serialize this Db85102dCurrCollId
	 */
   protected void serializeDb85102dCurrCollId(char[] db85102dCurrCollId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(db85102dCurrCollId,0,getStringValue(),beginDb85102dCurrCollId,DB_85102D_CURR_COLL_ID_LEN);
       localDb85102dCurrCollIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDb85102dCurrCollIdConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDb85102dCurrCollId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDb85102dCurrCollId() {	 
   		return (substring(getStringValue(),beginDb85102dCurrCollId,beginDb85102dCurrCollId + DB_85102D_CURR_COLL_ID_LEN));
   	}
     int localDb85102dTempCollIdCounter = -1;
     public boolean isDb85102dTempCollIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb85102dTempCollIdCounter != sharedCounter;
         localDb85102dTempCollIdCounter = sharedCounter; return hasModified;
     }
	protected static final int DB_85102D_TEMP_COLL_ID_LEN = 18;
	/**
	 * 	serialize this Db85102dTempCollId
	 */
   protected void serializeDb85102dTempCollId(char[] db85102dTempCollId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(db85102dTempCollId,0,getStringValue(),beginDb85102dTempCollId,DB_85102D_TEMP_COLL_ID_LEN);
       localDb85102dTempCollIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDb85102dTempCollIdConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDb85102dTempCollId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDb85102dTempCollId() {	 
   		return (substring(getStringValue(),beginDb85102dTempCollId,beginDb85102dTempCollId + DB_85102D_TEMP_COLL_ID_LEN));
   	}
     int localDb85102dPrevCollIdCounter = -1;
     public boolean isDb85102dPrevCollIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb85102dPrevCollIdCounter != sharedCounter;
         localDb85102dPrevCollIdCounter = sharedCounter; return hasModified;
     }
	protected static final int DB_85102D_PREV_COLL_ID_LEN = 18;
	/**
	 * 	serialize this Db85102dPrevCollId
	 */
   protected void serializeDb85102dPrevCollId(char[] db85102dPrevCollId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(db85102dPrevCollId,0,getStringValue(),beginDb85102dPrevCollId,DB_85102D_PREV_COLL_ID_LEN);
       localDb85102dPrevCollIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDb85102dPrevCollIdConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshDb85102dPrevCollId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDb85102dPrevCollId() {	 
   		return (substring(getStringValue(),beginDb85102dPrevCollId,beginDb85102dPrevCollId + DB_85102D_PREV_COLL_ID_LEN));
   	}
     int localDb85102dDb2CurrServerCounter = -1;
     public boolean isDb85102dDb2CurrServerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb85102dDb2CurrServerCounter != sharedCounter;
         localDb85102dDb2CurrServerCounter = sharedCounter; return hasModified;
     }
	protected static final int DB_85102D_DB_2_CURR_SERVER_LEN = 16;
	/**
	 * 	serialize this Db85102dDb2CurrServer
	 */
   protected void serializeDb85102dDb2CurrServer(char[] db85102dDb2CurrServer) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(db85102dDb2CurrServer,0,getStringValue(),beginDb85102dDb2CurrServer,DB_85102D_DB_2_CURR_SERVER_LEN);
       localDb85102dDb2CurrServerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDb85102dDb2CurrServerConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshDb85102dDb2CurrServer is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDb85102dDb2CurrServer() {	 
   		return (substring(getStringValue(),beginDb85102dDb2CurrServer,beginDb85102dDb2CurrServer + DB_85102D_DB_2_CURR_SERVER_LEN));
   	}
     int localDb85102dDb2UserCounter = -1;
     public boolean isDb85102dDb2UserModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb85102dDb2UserCounter != sharedCounter;
         localDb85102dDb2UserCounter = sharedCounter; return hasModified;
     }
	protected static final int DB_85102D_DB_2_USER_LEN = 8;
	/**
	 * 	serialize this Db85102dDb2User
	 */
   protected void serializeDb85102dDb2User(char[] db85102dDb2User) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(db85102dDb2User,0,getStringValue(),beginDb85102dDb2User,DB_85102D_DB_2_USER_LEN);
       localDb85102dDb2UserCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDb85102dDb2UserConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDb85102dDb2User is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDb85102dDb2User() {	 
   		return (substring(getStringValue(),beginDb85102dDb2User,beginDb85102dDb2User + DB_85102D_DB_2_USER_LEN));
   	}
     int localDb85102dDb2CurrSqlidCounter = -1;
     public boolean isDb85102dDb2CurrSqlidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb85102dDb2CurrSqlidCounter != sharedCounter;
         localDb85102dDb2CurrSqlidCounter = sharedCounter; return hasModified;
     }
	protected static final int DB_85102D_DB_2_CURR_SQLID_LEN = 8;
	/**
	 * 	serialize this Db85102dDb2CurrSqlid
	 */
   protected void serializeDb85102dDb2CurrSqlid(char[] db85102dDb2CurrSqlid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(db85102dDb2CurrSqlid,0,getStringValue(),beginDb85102dDb2CurrSqlid,DB_85102D_DB_2_CURR_SQLID_LEN);
       localDb85102dDb2CurrSqlidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDb85102dDb2CurrSqlidConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDb85102dDb2CurrSqlid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDb85102dDb2CurrSqlid() {	 
   		return (substring(getStringValue(),beginDb85102dDb2CurrSqlid,beginDb85102dDb2CurrSqlid + DB_85102D_DB_2_CURR_SQLID_LEN));
   	}
     int localDb85102dDb2cloneStatusCounter = -1;
     public boolean isDb85102dDb2cloneStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDb85102dDb2cloneStatusCounter != sharedCounter;
         localDb85102dDb2cloneStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int DB_85102D_DB_2CLONE_STATUS_LEN = 2;
	/**
	 * 	serialize this Db85102dDb2cloneStatus
	 */
   protected void serializeDb85102dDb2cloneStatus(char[] db85102dDb2cloneStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(db85102dDb2cloneStatus,0,getStringValue(),beginDb85102dDb2cloneStatus,DB_85102D_DB_2CLONE_STATUS_LEN);
       localDb85102dDb2cloneStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDb85102dDb2cloneStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDb85102dDb2cloneStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDb85102dDb2cloneStatus() {	 
   		return (substring(getStringValue(),beginDb85102dDb2cloneStatus,beginDb85102dDb2cloneStatus + DB_85102D_DB_2CLONE_STATUS_LEN));
   	}




}
  
