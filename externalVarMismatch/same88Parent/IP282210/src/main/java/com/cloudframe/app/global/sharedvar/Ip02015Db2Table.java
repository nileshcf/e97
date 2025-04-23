package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02015Db2Table is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:30. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip02015Db2Table extends Ip02015Db2TableSerialized { 
   

						private char[] ip02015ApplSysId = Field.fillLowValue(3);

						private char[] ip02015PkgSetNam = Field.fillLowValue(18);

						private char[] ip02015SrvrNam = Field.fillLowValue(18);
	
	/**
	* Constructor for Ip02015Db2Table
	**/
    public Ip02015Db2Table() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip02015Db2Table. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02015Db2Table(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip02015ApplSysId
	 *	@return ip02015ApplSysId
	 */
   public char[] getIp02015ApplSysId() throws CFException{
     if (isIp02015ApplSysIdModified()) { 
        ip02015ApplSysId = refreshIp02015ApplSysId();
     }
   		return ip02015ApplSysId;
   }

  
	/**
	*  set variable ip02015ApplSysId
	*  Corresponding COBOL Variable is IP02015-APPL-SYS-ID
	*  @param value
	**/
   public void setIp02015ApplSysId(char[] value) {
      ip02015ApplSysId = checkIp02015ApplSysIdConstraints(value);
      serializeIp02015ApplSysId(ip02015ApplSysId);
   } 

     /**
	 * 	Update Ip02015ApplSysId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015ApplSysId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015ApplSysId,ip02015ApplSysId.length);
   	
   }
   
   public void setIp02015ApplSysId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015ApplSysId,ip02015ApplSysId.length);
   	
   }
   
     /**
	 * 	Update Ip02015ApplSysId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015ApplSysId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015ApplSysId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015ApplSysId with another Field
	 *	@param value
	 */
   public void setIp02015ApplSysId(Field source) {
       replace(source,0,source.length(),beginIp02015ApplSysId,IP_02015_APPL_SYS_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015ApplSysId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015ApplSysId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015ApplSysId,IP_02015_APPL_SYS_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015ApplSysId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015ApplSysId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015ApplSysId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015PkgSetNam
	 *	@return ip02015PkgSetNam
	 */
   public char[] getIp02015PkgSetNam() throws CFException{
     if (isIp02015PkgSetNamModified()) { 
        ip02015PkgSetNam = refreshIp02015PkgSetNam();
     }
   		return ip02015PkgSetNam;
   }

  
	/**
	*  set variable ip02015PkgSetNam
	*  Corresponding COBOL Variable is IP02015-PKG-SET-NAM
	*  @param value
	**/
   public void setIp02015PkgSetNam(char[] value) {
      ip02015PkgSetNam = checkIp02015PkgSetNamConstraints(value);
      serializeIp02015PkgSetNam(ip02015PkgSetNam);
   } 

     /**
	 * 	Update Ip02015PkgSetNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015PkgSetNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015PkgSetNam,ip02015PkgSetNam.length);
   	
   }
   
   public void setIp02015PkgSetNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015PkgSetNam,ip02015PkgSetNam.length);
   	
   }
   
     /**
	 * 	Update Ip02015PkgSetNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015PkgSetNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015PkgSetNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015PkgSetNam with another Field
	 *	@param value
	 */
   public void setIp02015PkgSetNam(Field source) {
       replace(source,0,source.length(),beginIp02015PkgSetNam,IP_02015_PKG_SET_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015PkgSetNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015PkgSetNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015PkgSetNam,IP_02015_PKG_SET_NAM_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015PkgSetNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015PkgSetNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015PkgSetNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015SrvrNam
	 *	@return ip02015SrvrNam
	 */
   public char[] getIp02015SrvrNam() throws CFException{
     if (isIp02015SrvrNamModified()) { 
        ip02015SrvrNam = refreshIp02015SrvrNam();
     }
   		return ip02015SrvrNam;
   }

  
	/**
	*  set variable ip02015SrvrNam
	*  Corresponding COBOL Variable is IP02015-SRVR-NAM
	*  @param value
	**/
   public void setIp02015SrvrNam(char[] value) {
      ip02015SrvrNam = checkIp02015SrvrNamConstraints(value);
      serializeIp02015SrvrNam(ip02015SrvrNam);
   } 

     /**
	 * 	Update Ip02015SrvrNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015SrvrNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015SrvrNam,ip02015SrvrNam.length);
   	
   }
   
   public void setIp02015SrvrNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015SrvrNam,ip02015SrvrNam.length);
   	
   }
   
     /**
	 * 	Update Ip02015SrvrNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015SrvrNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015SrvrNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015SrvrNam with another Field
	 *	@param value
	 */
   public void setIp02015SrvrNam(Field source) {
       replace(source,0,source.length(),beginIp02015SrvrNam,IP_02015_SRVR_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015SrvrNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015SrvrNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015SrvrNam,IP_02015_SRVR_NAM_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015SrvrNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015SrvrNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015SrvrNam+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip02015Db2Table
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02015ApplSysId(CONSTANTS.SPACE_3);
         setIp02015PkgSetNam(CONSTANTS.SPACE_18);
         setIp02015SrvrNam(CONSTANTS.SPACE_18);
   }

		public static int getIp02015Db2TableFieldLength() {
			return IP_02015_DB_2_TABLE_LENGTH;
		}

}
  
