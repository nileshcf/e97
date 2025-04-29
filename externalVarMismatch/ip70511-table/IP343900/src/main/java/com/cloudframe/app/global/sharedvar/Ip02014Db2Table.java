package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014Db2Table is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip02014Db2Table extends Ip02014Db2TableSerialized { 
   

						private char[] ip02014ApplSysId = Field.fillLowValue(3);

						private char[] ip02014PPkgSetNam = Field.fillLowValue(18);

						private char[] ip02014PSrvrNam = Field.fillLowValue(18);

						private char[] ip02014BPkgSetNam = Field.fillLowValue(18);

						private char[] ip02014BSrvrNam = Field.fillLowValue(18);
	
	/**
	* Constructor for Ip02014Db2Table
	**/
    public Ip02014Db2Table() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip02014Db2Table. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014Db2Table(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip02014ApplSysId
	 *	@return ip02014ApplSysId
	 */
   public char[] getIp02014ApplSysId() throws CFException{
     if (isIp02014ApplSysIdModified()) { 
        ip02014ApplSysId = refreshIp02014ApplSysId();
     }
   		return ip02014ApplSysId;
   }

  
	/**
	*  set variable ip02014ApplSysId
	*  Corresponding COBOL Variable is IP02014-APPL-SYS-ID
	*  @param value
	**/
   public void setIp02014ApplSysId(char[] value) {
      ip02014ApplSysId = checkIp02014ApplSysIdConstraints(value);
      serializeIp02014ApplSysId(ip02014ApplSysId);
   } 

     /**
	 * 	Update Ip02014ApplSysId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014ApplSysId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014ApplSysId,ip02014ApplSysId.length);
   	
   }
   
   public void setIp02014ApplSysId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014ApplSysId,ip02014ApplSysId.length);
   	
   }
   
     /**
	 * 	Update Ip02014ApplSysId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014ApplSysId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014ApplSysId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014ApplSysId with another Field
	 *	@param value
	 */
   public void setIp02014ApplSysId(Field source) {
       replace(source,0,source.length(),beginIp02014ApplSysId,IP_02014_APPL_SYS_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014ApplSysId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014ApplSysId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014ApplSysId,IP_02014_APPL_SYS_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014ApplSysId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014ApplSysId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014ApplSysId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014PPkgSetNam
	 *	@return ip02014PPkgSetNam
	 */
   public char[] getIp02014PPkgSetNam() throws CFException{
     if (isIp02014PPkgSetNamModified()) { 
        ip02014PPkgSetNam = refreshIp02014PPkgSetNam();
     }
   		return ip02014PPkgSetNam;
   }

  
	/**
	*  set variable ip02014PPkgSetNam
	*  Corresponding COBOL Variable is IP02014-P-PKG-SET-NAM
	*  @param value
	**/
   public void setIp02014PPkgSetNam(char[] value) {
      ip02014PPkgSetNam = checkIp02014PPkgSetNamConstraints(value);
      serializeIp02014PPkgSetNam(ip02014PPkgSetNam);
   } 

     /**
	 * 	Update Ip02014PPkgSetNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014PPkgSetNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014PPkgSetNam,ip02014PPkgSetNam.length);
   	
   }
   
   public void setIp02014PPkgSetNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014PPkgSetNam,ip02014PPkgSetNam.length);
   	
   }
   
     /**
	 * 	Update Ip02014PPkgSetNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014PPkgSetNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014PPkgSetNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014PPkgSetNam with another Field
	 *	@param value
	 */
   public void setIp02014PPkgSetNam(Field source) {
       replace(source,0,source.length(),beginIp02014PPkgSetNam,IP_02014_PPKG_SET_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014PPkgSetNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014PPkgSetNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014PPkgSetNam,IP_02014_PPKG_SET_NAM_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014PPkgSetNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014PPkgSetNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014PPkgSetNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014PSrvrNam
	 *	@return ip02014PSrvrNam
	 */
   public char[] getIp02014PSrvrNam() throws CFException{
     if (isIp02014PSrvrNamModified()) { 
        ip02014PSrvrNam = refreshIp02014PSrvrNam();
     }
   		return ip02014PSrvrNam;
   }

  
	/**
	*  set variable ip02014PSrvrNam
	*  Corresponding COBOL Variable is IP02014-P-SRVR-NAM
	*  @param value
	**/
   public void setIp02014PSrvrNam(char[] value) {
      ip02014PSrvrNam = checkIp02014PSrvrNamConstraints(value);
      serializeIp02014PSrvrNam(ip02014PSrvrNam);
   } 

     /**
	 * 	Update Ip02014PSrvrNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014PSrvrNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014PSrvrNam,ip02014PSrvrNam.length);
   	
   }
   
   public void setIp02014PSrvrNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014PSrvrNam,ip02014PSrvrNam.length);
   	
   }
   
     /**
	 * 	Update Ip02014PSrvrNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014PSrvrNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014PSrvrNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014PSrvrNam with another Field
	 *	@param value
	 */
   public void setIp02014PSrvrNam(Field source) {
       replace(source,0,source.length(),beginIp02014PSrvrNam,IP_02014_PSRVR_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014PSrvrNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014PSrvrNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014PSrvrNam,IP_02014_PSRVR_NAM_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014PSrvrNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014PSrvrNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014PSrvrNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014BPkgSetNam
	 *	@return ip02014BPkgSetNam
	 */
   public char[] getIp02014BPkgSetNam() throws CFException{
     if (isIp02014BPkgSetNamModified()) { 
        ip02014BPkgSetNam = refreshIp02014BPkgSetNam();
     }
   		return ip02014BPkgSetNam;
   }

  
	/**
	*  set variable ip02014BPkgSetNam
	*  Corresponding COBOL Variable is IP02014-B-PKG-SET-NAM
	*  @param value
	**/
   public void setIp02014BPkgSetNam(char[] value) {
      ip02014BPkgSetNam = checkIp02014BPkgSetNamConstraints(value);
      serializeIp02014BPkgSetNam(ip02014BPkgSetNam);
   } 

     /**
	 * 	Update Ip02014BPkgSetNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014BPkgSetNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014BPkgSetNam,ip02014BPkgSetNam.length);
   	
   }
   
   public void setIp02014BPkgSetNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014BPkgSetNam,ip02014BPkgSetNam.length);
   	
   }
   
     /**
	 * 	Update Ip02014BPkgSetNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014BPkgSetNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014BPkgSetNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014BPkgSetNam with another Field
	 *	@param value
	 */
   public void setIp02014BPkgSetNam(Field source) {
       replace(source,0,source.length(),beginIp02014BPkgSetNam,IP_02014_BPKG_SET_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014BPkgSetNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014BPkgSetNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014BPkgSetNam,IP_02014_BPKG_SET_NAM_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014BPkgSetNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014BPkgSetNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014BPkgSetNam+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02014BSrvrNam
	 *	@return ip02014BSrvrNam
	 */
   public char[] getIp02014BSrvrNam() throws CFException{
     if (isIp02014BSrvrNamModified()) { 
        ip02014BSrvrNam = refreshIp02014BSrvrNam();
     }
   		return ip02014BSrvrNam;
   }

  
	/**
	*  set variable ip02014BSrvrNam
	*  Corresponding COBOL Variable is IP02014-B-SRVR-NAM
	*  @param value
	**/
   public void setIp02014BSrvrNam(char[] value) {
      ip02014BSrvrNam = checkIp02014BSrvrNamConstraints(value);
      serializeIp02014BSrvrNam(ip02014BSrvrNam);
   } 

     /**
	 * 	Update Ip02014BSrvrNam 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02014BSrvrNam(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02014BSrvrNam,ip02014BSrvrNam.length);
   	
   }
   
   public void setIp02014BSrvrNam(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014BSrvrNam,ip02014BSrvrNam.length);
   	
   }
   
     /**
	 * 	Update Ip02014BSrvrNam 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014BSrvrNam(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014BSrvrNam+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02014BSrvrNam with another Field
	 *	@param value
	 */
   public void setIp02014BSrvrNam(Field source) {
       replace(source,0,source.length(),beginIp02014BSrvrNam,IP_02014_BSRVR_NAM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02014BSrvrNam 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02014BSrvrNam(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02014BSrvrNam,IP_02014_BSRVR_NAM_LEN);
   	
   }
   
     /**
	 * 	Update Ip02014BSrvrNam 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014BSrvrNam(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02014BSrvrNam+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip02014Db2Table
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02014ApplSysId(CONSTANTS.SPACE_3);
         setIp02014PPkgSetNam(CONSTANTS.SPACE_18);
         setIp02014PSrvrNam(CONSTANTS.SPACE_18);
         setIp02014BPkgSetNam(CONSTANTS.SPACE_18);
         setIp02014BSrvrNam(CONSTANTS.SPACE_18);
   }

		public static int getIp02014Db2TableFieldLength() {
			return IP_02014_DB_2_TABLE_LENGTH;
		}

}
  
