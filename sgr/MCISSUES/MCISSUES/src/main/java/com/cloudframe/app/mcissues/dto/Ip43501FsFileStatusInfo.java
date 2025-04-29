package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip43501FsFileStatusInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip43501FsFileStatusInfo extends Ip43501FsFileStatusInfoSerialized { 
   

						private char[] ip43501FsFileStatus = Field.fillLowValue(1);

						private char[] ip43501FsFileErrorSw = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip43501FsFileStatusInfo
	**/
    public Ip43501FsFileStatusInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip43501FsFileStatusInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip43501FsFileStatusInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip43501FsFileStatus
	 *	@return ip43501FsFileStatus
	 */
   public char[] getIp43501FsFileStatus() throws CFException{
     if (isIp43501FsFileStatusModified()) { 
        ip43501FsFileStatus = refreshIp43501FsFileStatus();
     }
   		return ip43501FsFileStatus;
   }

  
	/**
	*  set variable ip43501FsFileStatus
	*  Corresponding COBOL Variable is IP43501-FS-FILE-STATUS
	*  @param value
	**/
   public void setIp43501FsFileStatus(char[] value) {
      ip43501FsFileStatus = checkIp43501FsFileStatusConstraints(value);
      serializeIp43501FsFileStatus(ip43501FsFileStatus);
   } 

     /**
	 * 	Update Ip43501FsFileStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501FsFileStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501FsFileStatus,ip43501FsFileStatus.length);
   	
   }
   
   public void setIp43501FsFileStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsFileStatus,ip43501FsFileStatus.length);
   	
   }
   
     /**
	 * 	Update Ip43501FsFileStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501FsFileStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsFileStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501FsFileStatus with another Field
	 *	@param value
	 */
   public void setIp43501FsFileStatus(Field source) {
       replace(source,0,source.length(),beginIp43501FsFileStatus,IP_43501_FS_FILE_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501FsFileStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501FsFileStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501FsFileStatus,IP_43501_FS_FILE_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501FsFileStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501FsFileStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsFileStatus+targetIndex,targetLen);
    
   }
	char[] ip43501FsFileAcc8888Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isIp43501FsFileAcc88()
	 *	@return  Returns true if isIp43501FsFileAcc88() is "A"
	 */
   public boolean isIp43501FsFileAcc88() throws CFException {
      return (  compareChars( getIp43501FsFileStatus() , ip43501FsFileAcc8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setIp43501FsFileAcc88True() {  			
    	setIp43501FsFileStatus( ip43501FsFileAcc8888Value);
   	}
	char[] ip43501FsFileRej8888Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isIp43501FsFileRej88()
	 *	@return  Returns true if isIp43501FsFileRej88() is "R"
	 */
   public boolean isIp43501FsFileRej88() throws CFException {
      return (  compareChars( getIp43501FsFileStatus() , ip43501FsFileRej8888Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setIp43501FsFileRej88True() {  			
    	setIp43501FsFileStatus( ip43501FsFileRej8888Value);
   	}
	char[] ip43501FsFileRejThresh8888Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isIp43501FsFileRejThresh88()
	 *	@return  Returns true if isIp43501FsFileRejThresh88() is "T"
	 */
   public boolean isIp43501FsFileRejThresh88() throws CFException {
      return (  compareChars( getIp43501FsFileStatus() , ip43501FsFileRejThresh8888Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setIp43501FsFileRejThresh88True() {  			
    	setIp43501FsFileStatus( ip43501FsFileRejThresh8888Value);
   	}
	/**
	 *	Returns the value of ip43501FsFileErrorSw
	 *	@return ip43501FsFileErrorSw
	 */
   public char[] getIp43501FsFileErrorSw() throws CFException{
     if (isIp43501FsFileErrorSwModified()) { 
        ip43501FsFileErrorSw = refreshIp43501FsFileErrorSw();
     }
   		return ip43501FsFileErrorSw;
   }

  
	/**
	*  set variable ip43501FsFileErrorSw
	*  Corresponding COBOL Variable is IP43501-FS-FILE-ERROR-SW
	*  @param value
	**/
   public void setIp43501FsFileErrorSw(char[] value) {
      ip43501FsFileErrorSw = checkIp43501FsFileErrorSwConstraints(value);
      serializeIp43501FsFileErrorSw(ip43501FsFileErrorSw);
   } 

     /**
	 * 	Update Ip43501FsFileErrorSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp43501FsFileErrorSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp43501FsFileErrorSw,ip43501FsFileErrorSw.length);
   	
   }
   
   public void setIp43501FsFileErrorSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsFileErrorSw,ip43501FsFileErrorSw.length);
   	
   }
   
     /**
	 * 	Update Ip43501FsFileErrorSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp43501FsFileErrorSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsFileErrorSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip43501FsFileErrorSw with another Field
	 *	@param value
	 */
   public void setIp43501FsFileErrorSw(Field source) {
       replace(source,0,source.length(),beginIp43501FsFileErrorSw,IP_43501_FS_FILE_ERROR_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip43501FsFileErrorSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp43501FsFileErrorSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp43501FsFileErrorSw,IP_43501_FS_FILE_ERROR_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip43501FsFileErrorSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp43501FsFileErrorSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp43501FsFileErrorSw+targetIndex,targetLen);
    
   }
	char[] ip43501FsFileErrors8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp43501FsFileErrors88()
	 *	@return  Returns true if isIp43501FsFileErrors88() is "Y"
	 */
   public boolean isIp43501FsFileErrors88() throws CFException {
      return (  compareChars( getIp43501FsFileErrorSw() , ip43501FsFileErrors8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp43501FsFileErrors88True() {  			
    	setIp43501FsFileErrorSw( ip43501FsFileErrors8888Value);
   	}
	char[] ip43501FsNoErrors8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp43501FsNoErrors88()
	 *	@return  Returns true if isIp43501FsNoErrors88() is "N"
	 */
   public boolean isIp43501FsNoErrors88() throws CFException {
      return (  compareChars( getIp43501FsFileErrorSw() , ip43501FsNoErrors8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp43501FsNoErrors88True() {  			
    	setIp43501FsFileErrorSw( ip43501FsNoErrors8888Value);
   	}

	
	
	

		public static int getIp43501FsFileStatusInfoFieldLength() {
			return IP_43501_FS_FILE_STATUS_INFO_LENGTH;
		}

}
  
