package com.cloudframe.app.ip699930.dto;

/**
*  The class Ip28221RestartTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/


import com.cloudframe.app.ip699930.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip28221RestartTable extends Ip28221RestartTableSerialized { 
   

						private char[] ip28221ApplSysId = Field.fillLowValue(3);

						private char[] ip28221Db2PrimBackupInd = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip28221RestartTable
	**/
    public Ip28221RestartTable() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip28221RestartTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip28221RestartTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip28221ApplSysId
	 *	@return ip28221ApplSysId
	 */
   public char[] getIp28221ApplSysId() throws CFException{
     if (isIp28221ApplSysIdModified()) { 
        ip28221ApplSysId = refreshIp28221ApplSysId();
     }
   		return ip28221ApplSysId;
   }

  
	/**
	*  set variable ip28221ApplSysId
	*  Corresponding COBOL Variable is IP28221-APPL-SYS-ID
	*  @param value
	**/
   public void setIp28221ApplSysId(char[] value) {
      ip28221ApplSysId = checkIp28221ApplSysIdConstraints(value);
      serializeIp28221ApplSysId(ip28221ApplSysId);
   } 

     /**
	 * 	Update Ip28221ApplSysId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp28221ApplSysId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp28221ApplSysId,ip28221ApplSysId.length);
   	
   }
   
   public void setIp28221ApplSysId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp28221ApplSysId,ip28221ApplSysId.length);
   	
   }
   
     /**
	 * 	Update Ip28221ApplSysId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp28221ApplSysId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp28221ApplSysId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip28221ApplSysId with another Field
	 *	@param value
	 */
   public void setIp28221ApplSysId(Field source) {
       replace(source,0,source.length(),beginIp28221ApplSysId,IP_28221_APPL_SYS_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip28221ApplSysId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp28221ApplSysId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp28221ApplSysId,IP_28221_APPL_SYS_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip28221ApplSysId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp28221ApplSysId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp28221ApplSysId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip28221Db2PrimBackupInd
	 *	@return ip28221Db2PrimBackupInd
	 */
   public char[] getIp28221Db2PrimBackupInd() throws CFException{
     if (isIp28221Db2PrimBackupIndModified()) { 
        ip28221Db2PrimBackupInd = refreshIp28221Db2PrimBackupInd();
     }
   		return ip28221Db2PrimBackupInd;
   }

  
	/**
	*  set variable ip28221Db2PrimBackupInd
	*  Corresponding COBOL Variable is IP28221-DB2-PRIM-BACKUP-IND
	*  @param value
	**/
   public void setIp28221Db2PrimBackupInd(char[] value) {
      ip28221Db2PrimBackupInd = checkIp28221Db2PrimBackupIndConstraints(value);
      serializeIp28221Db2PrimBackupInd(ip28221Db2PrimBackupInd);
   } 

     /**
	 * 	Update Ip28221Db2PrimBackupInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp28221Db2PrimBackupInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp28221Db2PrimBackupInd,ip28221Db2PrimBackupInd.length);
   	
   }
   
   public void setIp28221Db2PrimBackupInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp28221Db2PrimBackupInd,ip28221Db2PrimBackupInd.length);
   	
   }
   
     /**
	 * 	Update Ip28221Db2PrimBackupInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp28221Db2PrimBackupInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp28221Db2PrimBackupInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip28221Db2PrimBackupInd with another Field
	 *	@param value
	 */
   public void setIp28221Db2PrimBackupInd(Field source) {
       replace(source,0,source.length(),beginIp28221Db2PrimBackupInd,IP_28221_DB_2_PRIM_BACKUP_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip28221Db2PrimBackupInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp28221Db2PrimBackupInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp28221Db2PrimBackupInd,IP_28221_DB_2_PRIM_BACKUP_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip28221Db2PrimBackupInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp28221Db2PrimBackupInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp28221Db2PrimBackupInd+targetIndex,targetLen);
    
   }
	char[] ip28221Db2Primary8888Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isIp28221Db2Primary88()
	 *	@return  Returns true if isIp28221Db2Primary88() is "P"
	 */
   public boolean isIp28221Db2Primary88() throws CFException {
      return (  compareChars( getIp28221Db2PrimBackupInd() , ip28221Db2Primary8888Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setIp28221Db2Primary88True() {  			
    	setIp28221Db2PrimBackupInd( ip28221Db2Primary8888Value);
   	}
	char[] ip28221Db2Backup8888Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isIp28221Db2Backup88()
	 *	@return  Returns true if isIp28221Db2Backup88() is "B"
	 */
   public boolean isIp28221Db2Backup88() throws CFException {
      return (  compareChars( getIp28221Db2PrimBackupInd() , ip28221Db2Backup8888Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setIp28221Db2Backup88True() {  			
    	setIp28221Db2PrimBackupInd( ip28221Db2Backup8888Value);
   	}

	
	
	

		public static int getIp28221RestartTableFieldLength() {
			return IP_28221_RESTART_TABLE_LENGTH;
		}

}
  
