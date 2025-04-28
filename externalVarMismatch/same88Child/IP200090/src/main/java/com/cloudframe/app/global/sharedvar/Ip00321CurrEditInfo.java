package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00321CurrEditInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:00. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00321CurrEditInfo extends Ip00321CurrEditInfoSerialized { 
   

						private char[] ip00321EditType = Field.fillLowValue(1);

						private char[] ip00321EditModule = Field.fillLowValue(8);

						private char[] ip00321EditModulePtr = Field.fillLowValue(8);
				private Ip00321ErrorInfo ip00321ErrorInfo = new Ip00321ErrorInfo();

						private char[] ip00321ModuleLocationInd = Field.fillLowValue(1);
				private Ip00321ReplErrTextInfo ip00321ReplErrTextInfo = new Ip00321ReplErrTextInfo();

						private char[] ip00321BypEditIrddrvSrv = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00321CurrEditInfo
	**/
    public Ip00321CurrEditInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00321CurrEditInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00321CurrEditInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip00321ErrorInfo.setParent(this,getStartOffset() + 17);
	       			ip00321ReplErrTextInfo.setParent(this,getStartOffset() + 37);
    } 

	/**
	 *	Returns the value of ip00321EditType
	 *	@return ip00321EditType
	 */
   public char[] getIp00321EditType() throws CFException{
     if (isIp00321EditTypeModified()) { 
        ip00321EditType = refreshIp00321EditType();
     }
   		return ip00321EditType;
   }

  
	/**
	*  set variable ip00321EditType
	*  Corresponding COBOL Variable is IP00321-EDIT-TYPE
	*  @param value
	**/
   public void setIp00321EditType(char[] value) {
      ip00321EditType = checkIp00321EditTypeConstraints(value);
      serializeIp00321EditType(ip00321EditType);
   } 

     /**
	 * 	Update Ip00321EditType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00321EditType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00321EditType,ip00321EditType.length);
   	
   }
   
   public void setIp00321EditType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00321EditType,ip00321EditType.length);
   	
   }
   
     /**
	 * 	Update Ip00321EditType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00321EditType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00321EditType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00321EditType with another Field
	 *	@param value
	 */
   public void setIp00321EditType(Field source) {
       replace(source,0,source.length(),beginIp00321EditType,IP_00321_EDIT_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00321EditType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00321EditType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00321EditType,IP_00321_EDIT_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip00321EditType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00321EditType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00321EditType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00321EditModule
	 *	@return ip00321EditModule
	 */
   public char[] getIp00321EditModule() throws CFException{
     if (isIp00321EditModuleModified()) { 
        ip00321EditModule = refreshIp00321EditModule();
     }
   		return ip00321EditModule;
   }

  
	/**
	*  set variable ip00321EditModule
	*  Corresponding COBOL Variable is IP00321-EDIT-MODULE
	*  @param value
	**/
   public void setIp00321EditModule(char[] value) {
      ip00321EditModule = checkIp00321EditModuleConstraints(value);
      serializeIp00321EditModule(ip00321EditModule);
   } 

     /**
	 * 	Update Ip00321EditModule 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00321EditModule(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00321EditModule,ip00321EditModule.length);
   	
   }
   
   public void setIp00321EditModule(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00321EditModule,ip00321EditModule.length);
   	
   }
   
     /**
	 * 	Update Ip00321EditModule 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00321EditModule(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00321EditModule+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00321EditModule with another Field
	 *	@param value
	 */
   public void setIp00321EditModule(Field source) {
       replace(source,0,source.length(),beginIp00321EditModule,IP_00321_EDIT_MODULE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00321EditModule 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00321EditModule(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00321EditModule,IP_00321_EDIT_MODULE_LEN);
   	
   }
   
     /**
	 * 	Update Ip00321EditModule 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00321EditModule(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00321EditModule+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00321EditModulePtr
	 *	@return ip00321EditModulePtr
	 */
   public char[] getIp00321EditModulePtr() throws CFException{
     if (isIp00321EditModulePtrModified()) { 
        ip00321EditModulePtr = refreshIp00321EditModulePtr();
     }
   		return ip00321EditModulePtr;
   }

  
	/**
	*  set variable ip00321EditModulePtr
	*  Corresponding COBOL Variable is IP00321-EDIT-MODULE-PTR
	*  @param value
	**/
   public void setIp00321EditModulePtr(char[] value) {
      ip00321EditModulePtr = checkIp00321EditModulePtrConstraints(value);
      serializeIp00321EditModulePtr(ip00321EditModulePtr);
   } 

     /**
	 * 	Update Ip00321EditModulePtr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00321EditModulePtr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00321EditModulePtr,ip00321EditModulePtr.length);
   	
   }
   
   public void setIp00321EditModulePtr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00321EditModulePtr,ip00321EditModulePtr.length);
   	
   }
   
     /**
	 * 	Update Ip00321EditModulePtr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00321EditModulePtr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00321EditModulePtr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00321EditModulePtr with another Field
	 *	@param value
	 */
   public void setIp00321EditModulePtr(Field source) {
       replace(source,0,source.length(),beginIp00321EditModulePtr,IP_00321_EDIT_MODULE_PTR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00321EditModulePtr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00321EditModulePtr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00321EditModulePtr,IP_00321_EDIT_MODULE_PTR_LEN);
   	
   }
   
     /**
	 * 	Update Ip00321EditModulePtr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00321EditModulePtr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00321EditModulePtr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00321ErrorInfo
	 *	@return ip00321ErrorInfo
	 */   
	 public Ip00321ErrorInfo getIp00321ErrorInfo() {
   	return ip00321ErrorInfo;
   }
   /**
	* 	Update Ip00321ErrorInfo with the passed value
	*   Corresponding COBOL Variable is IP00321-ERROR-INFO
	*	@param value
	*/
   public void setIp00321ErrorInfo(char[] value) {
      ip00321ErrorInfo.setString(value); 
   }   
    
     /**
	 * 	Update Ip00321ErrorInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00321ErrorInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00321ErrorInfo.begin,ip00321ErrorInfo.length());
   }
   
     /**
	 * 	Update Ip00321ErrorInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00321ErrorInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00321ErrorInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00321ErrorInfo with another Field
	 *	@param value
	 */
   public void setIp00321ErrorInfo(Field source) {
   	replace(source,0,source.length(),ip00321ErrorInfo.begin,ip00321ErrorInfo.length());
   }  
   
     /**
	 * 	Update Ip00321ErrorInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00321ErrorInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00321ErrorInfo.begin,ip00321ErrorInfo.length());
   }
   
     /**
	 * 	Update Ip00321ErrorInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00321ErrorInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00321ErrorInfo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip00321ModuleLocationInd
	 *	@return ip00321ModuleLocationInd
	 */
   public char[] getIp00321ModuleLocationInd() throws CFException{
     if (isIp00321ModuleLocationIndModified()) { 
        ip00321ModuleLocationInd = refreshIp00321ModuleLocationInd();
     }
   		return ip00321ModuleLocationInd;
   }

  
	/**
	*  set variable ip00321ModuleLocationInd
	*  Corresponding COBOL Variable is IP00321-MODULE-LOCATION-IND
	*  @param value
	**/
   public void setIp00321ModuleLocationInd(char[] value) {
      ip00321ModuleLocationInd = checkIp00321ModuleLocationIndConstraints(value);
      serializeIp00321ModuleLocationInd(ip00321ModuleLocationInd);
   } 

     /**
	 * 	Update Ip00321ModuleLocationInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00321ModuleLocationInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00321ModuleLocationInd,ip00321ModuleLocationInd.length);
   	
   }
   
   public void setIp00321ModuleLocationInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00321ModuleLocationInd,ip00321ModuleLocationInd.length);
   	
   }
   
     /**
	 * 	Update Ip00321ModuleLocationInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00321ModuleLocationInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00321ModuleLocationInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00321ModuleLocationInd with another Field
	 *	@param value
	 */
   public void setIp00321ModuleLocationInd(Field source) {
       replace(source,0,source.length(),beginIp00321ModuleLocationInd,IP_00321_MODULE_LOCATION_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00321ModuleLocationInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00321ModuleLocationInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00321ModuleLocationInd,IP_00321_MODULE_LOCATION_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00321ModuleLocationInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00321ModuleLocationInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00321ModuleLocationInd+targetIndex,targetLen);
    
   }
	char[] ip00321PreeditOnly8888Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isIp00321PreeditOnly88()
	 *	@return  Returns true if isIp00321PreeditOnly88() is "P"
	 */
   public boolean isIp00321PreeditOnly88() throws CFException {
      return (  compareChars( getIp00321ModuleLocationInd() , ip00321PreeditOnly8888Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setIp00321PreeditOnly88True() {  			
    	setIp00321ModuleLocationInd( ip00321PreeditOnly8888Value);
   	}
	char[] ip00321CentralSiteOnly8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isIp00321CentralSiteOnly88()
	 *	@return  Returns true if isIp00321CentralSiteOnly88() is "C"
	 */
   public boolean isIp00321CentralSiteOnly88() throws CFException {
      return (  compareChars( getIp00321ModuleLocationInd() , ip00321CentralSiteOnly8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setIp00321CentralSiteOnly88True() {  			
    	setIp00321ModuleLocationInd( ip00321CentralSiteOnly8888Value);
   	}
	char[] ip00321CntrlAndPreedit8888Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isIp00321CntrlAndPreedit88()
	 *	@return  Returns true if isIp00321CntrlAndPreedit88() is "B"
	 */
   public boolean isIp00321CntrlAndPreedit88() throws CFException {
      return (  compareChars( getIp00321ModuleLocationInd() , ip00321CntrlAndPreedit8888Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setIp00321CntrlAndPreedit88True() {  			
    	setIp00321ModuleLocationInd( ip00321CntrlAndPreedit8888Value);
   	}
	/**
	 *	Returns the value of ip00321ReplErrTextInfo
	 *	@return ip00321ReplErrTextInfo
	 */   
	 public Ip00321ReplErrTextInfo getIp00321ReplErrTextInfo() {
   	return ip00321ReplErrTextInfo;
   }
   /**
	* 	Update Ip00321ReplErrTextInfo with the passed value
	*   Corresponding COBOL Variable is IP00321-REPL-ERR-TEXT-INFO
	*	@param value
	*/
   public void setIp00321ReplErrTextInfo(char[] value) {
      ip00321ReplErrTextInfo.setString(value); 
   }   
    
     /**
	 * 	Update Ip00321ReplErrTextInfo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00321ReplErrTextInfo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00321ReplErrTextInfo.begin,ip00321ReplErrTextInfo.length());
   }
   
     /**
	 * 	Update Ip00321ReplErrTextInfo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00321ReplErrTextInfo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00321ReplErrTextInfo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00321ReplErrTextInfo with another Field
	 *	@param value
	 */
   public void setIp00321ReplErrTextInfo(Field source) {
   	replace(source,0,source.length(),ip00321ReplErrTextInfo.begin,ip00321ReplErrTextInfo.length());
   }  
   
     /**
	 * 	Update Ip00321ReplErrTextInfo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00321ReplErrTextInfo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00321ReplErrTextInfo.begin,ip00321ReplErrTextInfo.length());
   }
   
     /**
	 * 	Update Ip00321ReplErrTextInfo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00321ReplErrTextInfo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00321ReplErrTextInfo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip00321BypEditIrddrvSrv
	 *	@return ip00321BypEditIrddrvSrv
	 */
   public char[] getIp00321BypEditIrddrvSrv() throws CFException{
     if (isIp00321BypEditIrddrvSrvModified()) { 
        ip00321BypEditIrddrvSrv = refreshIp00321BypEditIrddrvSrv();
     }
   		return ip00321BypEditIrddrvSrv;
   }

  
	/**
	*  set variable ip00321BypEditIrddrvSrv
	*  Corresponding COBOL Variable is IP00321-BYP-EDIT-IRDDRV-SRV
	*  @param value
	**/
   public void setIp00321BypEditIrddrvSrv(char[] value) {
      ip00321BypEditIrddrvSrv = checkIp00321BypEditIrddrvSrvConstraints(value);
      serializeIp00321BypEditIrddrvSrv(ip00321BypEditIrddrvSrv);
   } 

     /**
	 * 	Update Ip00321BypEditIrddrvSrv 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00321BypEditIrddrvSrv(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00321BypEditIrddrvSrv,ip00321BypEditIrddrvSrv.length);
   	
   }
   
   public void setIp00321BypEditIrddrvSrv(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00321BypEditIrddrvSrv,ip00321BypEditIrddrvSrv.length);
   	
   }
   
     /**
	 * 	Update Ip00321BypEditIrddrvSrv 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00321BypEditIrddrvSrv(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00321BypEditIrddrvSrv+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00321BypEditIrddrvSrv with another Field
	 *	@param value
	 */
   public void setIp00321BypEditIrddrvSrv(Field source) {
       replace(source,0,source.length(),beginIp00321BypEditIrddrvSrv,IP_00321_BYP_EDIT_IRDDRV_SRV_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00321BypEditIrddrvSrv 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00321BypEditIrddrvSrv(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00321BypEditIrddrvSrv,IP_00321_BYP_EDIT_IRDDRV_SRV_LEN);
   	
   }
   
     /**
	 * 	Update Ip00321BypEditIrddrvSrv 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00321BypEditIrddrvSrv(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00321BypEditIrddrvSrv+targetIndex,targetLen);
    
   }
	char[] ip00321IrdDrvBypEdit8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00321IrdDrvBypEdit88()
	 *	@return  Returns true if isIp00321IrdDrvBypEdit88() is "Y"
	 */
   public boolean isIp00321IrdDrvBypEdit88() throws CFException {
      return (  compareChars( getIp00321BypEditIrddrvSrv() , ip00321IrdDrvBypEdit8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00321IrdDrvBypEdit88True() {  			
    	setIp00321BypEditIrddrvSrv( ip00321IrdDrvBypEdit8888Value);
   	}
	char[] ip00321IrdDrvNtBypEdit8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00321IrdDrvNtBypEdit88()
	 *	@return  Returns true if isIp00321IrdDrvNtBypEdit88() is "N"
	 */
   public boolean isIp00321IrdDrvNtBypEdit88() throws CFException {
      return (  compareChars( getIp00321BypEditIrddrvSrv() , ip00321IrdDrvNtBypEdit8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00321IrdDrvNtBypEdit88True() {  			
    	setIp00321BypEditIrddrvSrv( ip00321IrdDrvNtBypEdit8888Value);
   	}

	
	
	
	/**
	 * 	initializes Ip00321CurrEditInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00321EditType(CONSTANTS.SPACE);
         setIp00321EditModule(CONSTANTS.SPACE_8);
         setIp00321EditModulePtr(CONSTANTS.SPACE_8);
          ip00321ErrorInfo.initialize();
     
         setIp00321ModuleLocationInd(CONSTANTS.SPACE);
          ip00321ReplErrTextInfo.initialize();
     
         setIp00321BypEditIrddrvSrv(CONSTANTS.SPACE);
   }

		public static int getIp00321CurrEditInfoFieldLength() {
			return IP_00321_CURR_EDIT_INFO_LENGTH;
		}

}
  
