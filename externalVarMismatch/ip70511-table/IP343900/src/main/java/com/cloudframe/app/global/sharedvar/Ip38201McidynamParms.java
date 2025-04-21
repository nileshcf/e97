package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip38201McidynamParms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip38201McidynamParms")

public class Ip38201McidynamParms extends Ip38201McidynamParmsSerialized  implements InitializingBean {
   

						private char[] ip38201Function = Field.fillLowValue(1);

						private char[] ip38201Dd = Field.fillLowValue(8);

						private char[] ip38201Dsn = Field.fillLowValue(44);
				private Ip38201Disposition ip38201Disposition = new Ip38201Disposition();
				private Ip38201AllocateParms ip38201AllocateParms = new Ip38201AllocateParms();

						private char[] ip38201ReturnCode = Field.fillLowValue(4);

						private char[] ip38201Filler = Field.fillLowValue(25);
	
	/**
	* Constructor for Ip38201McidynamParms
	**/
    public Ip38201McidynamParms() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip38201Disposition.setParent(this,getStartOffset() + 53);
	       			ip38201AllocateParms.setParent(this,getStartOffset() + 56);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip38201Function
	 *	@return ip38201Function
	 */
   public char[] getIp38201Function() throws CFException{
     if (isIp38201FunctionModified()) { 
        ip38201Function = refreshIp38201Function();
     }
   		return ip38201Function;
   }

  
	/**
	*  set variable ip38201Function
	*  Corresponding COBOL Variable is IP38201-FUNCTION
	*  @param value
	**/
   public void setIp38201Function(char[] value) {
      ip38201Function = checkIp38201FunctionConstraints(value);
      serializeIp38201Function(ip38201Function);
   } 

     /**
	 * 	Update Ip38201Function 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp38201Function(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp38201Function,ip38201Function.length);
   	
   }
   
   public void setIp38201Function(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201Function,ip38201Function.length);
   	
   }
   
     /**
	 * 	Update Ip38201Function 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201Function(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201Function+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip38201Function with another Field
	 *	@param value
	 */
   public void setIp38201Function(Field source) {
       replace(source,0,source.length(),beginIp38201Function,IP_38201_FUNCTION_LEN);
   	
   }  
   
     /**
	 * 	Update Ip38201Function 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp38201Function(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp38201Function,IP_38201_FUNCTION_LEN);
   	
   }
   
     /**
	 * 	Update Ip38201Function 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201Function(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201Function+targetIndex,targetLen);
    
   }
	char[] ip38201Allocate8888Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isIp38201Allocate88()
	 *	@return  Returns true if isIp38201Allocate88() is "A"
	 */
   public boolean isIp38201Allocate88() throws CFException {
      return (  compareChars( getIp38201Function() , ip38201Allocate8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setIp38201Allocate88True() {  			
    	setIp38201Function( ip38201Allocate8888Value);
   	}
	char[] ip38201Unallocate8888Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isIp38201Unallocate88()
	 *	@return  Returns true if isIp38201Unallocate88() is "U"
	 */
   public boolean isIp38201Unallocate88() throws CFException {
      return (  compareChars( getIp38201Function() , ip38201Unallocate8888Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setIp38201Unallocate88True() {  			
    	setIp38201Function( ip38201Unallocate8888Value);
   	}
	char[] ip38201FinalUnallocate8888Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isIp38201FinalUnallocate88()
	 *	@return  Returns true if isIp38201FinalUnallocate88() is "F"
	 */
   public boolean isIp38201FinalUnallocate88() throws CFException {
      return (  compareChars( getIp38201Function() , ip38201FinalUnallocate8888Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setIp38201FinalUnallocate88True() {  			
    	setIp38201Function( ip38201FinalUnallocate8888Value);
   	}
	char[] ip38201Delete8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isIp38201Delete88()
	 *	@return  Returns true if isIp38201Delete88() is "D"
	 */
   public boolean isIp38201Delete88() throws CFException {
      return (  compareChars( getIp38201Function() , ip38201Delete8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setIp38201Delete88True() {  			
    	setIp38201Function( ip38201Delete8888Value);
   	}
	char[] ip38201Info8888Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isIp38201Info88()
	 *	@return  Returns true if isIp38201Info88() is "I"
	 */
   public boolean isIp38201Info88() throws CFException {
      return (  compareChars( getIp38201Function() , ip38201Info8888Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setIp38201Info88True() {  			
    	setIp38201Function( ip38201Info8888Value);
   	}
	char[] ip38201End8888Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isIp38201End88()
	 *	@return  Returns true if isIp38201End88() is "E"
	 */
   public boolean isIp38201End88() throws CFException {
      return (  compareChars( getIp38201Function() , ip38201End8888Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setIp38201End88True() {  			
    	setIp38201Function( ip38201End8888Value);
   	}
	/**
	 *	Returns the value of ip38201Dd
	 *	@return ip38201Dd
	 */
   public char[] getIp38201Dd() throws CFException{
     if (isIp38201DdModified()) { 
        ip38201Dd = refreshIp38201Dd();
     }
   		return ip38201Dd;
   }

  
	/**
	*  set variable ip38201Dd
	*  Corresponding COBOL Variable is IP38201-DD
	*  @param value
	**/
   public void setIp38201Dd(char[] value) {
      ip38201Dd = checkIp38201DdConstraints(value);
      serializeIp38201Dd(ip38201Dd);
   } 

     /**
	 * 	Update Ip38201Dd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp38201Dd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp38201Dd,ip38201Dd.length);
   	
   }
   
   public void setIp38201Dd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201Dd,ip38201Dd.length);
   	
   }
   
     /**
	 * 	Update Ip38201Dd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201Dd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201Dd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip38201Dd with another Field
	 *	@param value
	 */
   public void setIp38201Dd(Field source) {
       replace(source,0,source.length(),beginIp38201Dd,IP_38201_DD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip38201Dd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp38201Dd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp38201Dd,IP_38201_DD_LEN);
   	
   }
   
     /**
	 * 	Update Ip38201Dd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201Dd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201Dd+targetIndex,targetLen);
    
   }
	char[] ip38201DdBlank8888Value = "        ".toCharArray();
	/**
	 *	Test condition " " for isIp38201DdBlank88()
	 *	@return  Returns true if isIp38201DdBlank88() is " "
	 */
   public boolean isIp38201DdBlank88() throws CFException {
      return (  compareChars( getIp38201Dd() , ip38201DdBlank8888Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setIp38201DdBlank88True() {  			
    	setIp38201Dd( ip38201DdBlank8888Value);
   	}
	/**
	 *	Returns the value of ip38201Dsn
	 *	@return ip38201Dsn
	 */
   public char[] getIp38201Dsn() throws CFException{
     if (isIp38201DsnModified()) { 
        ip38201Dsn = refreshIp38201Dsn();
     }
   		return ip38201Dsn;
   }

  
	/**
	*  set variable ip38201Dsn
	*  Corresponding COBOL Variable is IP38201-DSN
	*  @param value
	**/
   public void setIp38201Dsn(char[] value) {
      ip38201Dsn = checkIp38201DsnConstraints(value);
      serializeIp38201Dsn(ip38201Dsn);
   } 

     /**
	 * 	Update Ip38201Dsn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp38201Dsn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp38201Dsn,ip38201Dsn.length);
   	
   }
   
   public void setIp38201Dsn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201Dsn,ip38201Dsn.length);
   	
   }
   
     /**
	 * 	Update Ip38201Dsn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201Dsn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201Dsn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip38201Dsn with another Field
	 *	@param value
	 */
   public void setIp38201Dsn(Field source) {
       replace(source,0,source.length(),beginIp38201Dsn,IP_38201_DSN_LEN);
   	
   }  
   
     /**
	 * 	Update Ip38201Dsn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp38201Dsn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp38201Dsn,IP_38201_DSN_LEN);
   	
   }
   
     /**
	 * 	Update Ip38201Dsn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201Dsn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201Dsn+targetIndex,targetLen);
    
   }
	char[] ip38201DsnBlank8888Value = "                                            ".toCharArray();
	/**
	 *	Test condition " " for isIp38201DsnBlank88()
	 *	@return  Returns true if isIp38201DsnBlank88() is " "
	 */
   public boolean isIp38201DsnBlank88() throws CFException {
      return (  compareChars( getIp38201Dsn() , ip38201DsnBlank8888Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setIp38201DsnBlank88True() {  			
    	setIp38201Dsn( ip38201DsnBlank8888Value);
   	}
	/**
	 *	Returns the value of ip38201Disposition
	 *	@return ip38201Disposition
	 */   
	 public Ip38201Disposition getIp38201Disposition() {
   	return ip38201Disposition;
   }
   /**
	* 	Update Ip38201Disposition with the passed value
	*   Corresponding COBOL Variable is IP38201-DISPOSITION
	*	@param value
	*/
   public void setIp38201Disposition(char[] value) {
      ip38201Disposition.setString(value); 
   }   
    
     /**
	 * 	Update Ip38201Disposition 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp38201Disposition(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip38201Disposition.begin,ip38201Disposition.length());
   }
   
     /**
	 * 	Update Ip38201Disposition 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201Disposition(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip38201Disposition.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip38201Disposition with another Field
	 *	@param value
	 */
   public void setIp38201Disposition(Field source) {
   	replace(source,0,source.length(),ip38201Disposition.begin,ip38201Disposition.length());
   }  
   
     /**
	 * 	Update Ip38201Disposition 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp38201Disposition(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip38201Disposition.begin,ip38201Disposition.length());
   }
   
     /**
	 * 	Update Ip38201Disposition 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201Disposition(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip38201Disposition.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip38201AllocateParms
	 *	@return ip38201AllocateParms
	 */   
	 public Ip38201AllocateParms getIp38201AllocateParms() {
   	return ip38201AllocateParms;
   }
   /**
	* 	Update Ip38201AllocateParms with the passed value
	*   Corresponding COBOL Variable is IP38201-ALLOCATE-PARMS
	*	@param value
	*/
   public void setIp38201AllocateParms(char[] value) {
      ip38201AllocateParms.setString(value); 
   }   
    
     /**
	 * 	Update Ip38201AllocateParms 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp38201AllocateParms(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip38201AllocateParms.begin,ip38201AllocateParms.length());
   }
   
     /**
	 * 	Update Ip38201AllocateParms 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201AllocateParms(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip38201AllocateParms.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip38201AllocateParms with another Field
	 *	@param value
	 */
   public void setIp38201AllocateParms(Field source) {
   	replace(source,0,source.length(),ip38201AllocateParms.begin,ip38201AllocateParms.length());
   }  
   
     /**
	 * 	Update Ip38201AllocateParms 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp38201AllocateParms(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip38201AllocateParms.begin,ip38201AllocateParms.length());
   }
   
     /**
	 * 	Update Ip38201AllocateParms 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201AllocateParms(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip38201AllocateParms.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip38201ReturnCode
	 *	@return ip38201ReturnCode
	 */
   public char[] getIp38201ReturnCode() throws CFException{
     if (isIp38201ReturnCodeModified()) { 
        ip38201ReturnCode = refreshIp38201ReturnCode();
     }
   		return ip38201ReturnCode;
   }

  
	/**
	*  set variable ip38201ReturnCode
	*  Corresponding COBOL Variable is IP38201-RETURN-CODE
	*  @param value
	**/
   public void setIp38201ReturnCode(char[] value) {
      ip38201ReturnCode = checkIp38201ReturnCodeConstraints(value);
      serializeIp38201ReturnCode(ip38201ReturnCode);
   } 

     /**
	 * 	Update Ip38201ReturnCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp38201ReturnCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp38201ReturnCode,ip38201ReturnCode.length);
   	
   }
   
   public void setIp38201ReturnCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201ReturnCode,ip38201ReturnCode.length);
   	
   }
   
     /**
	 * 	Update Ip38201ReturnCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201ReturnCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201ReturnCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip38201ReturnCode with another Field
	 *	@param value
	 */
   public void setIp38201ReturnCode(Field source) {
       replace(source,0,source.length(),beginIp38201ReturnCode,IP_38201_RETURN_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip38201ReturnCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp38201ReturnCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp38201ReturnCode,IP_38201_RETURN_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip38201ReturnCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201ReturnCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201ReturnCode+targetIndex,targetLen);
    
   }
	char[] ip38201ReturnCode00058888Value = "0005".toCharArray();
	/**
	 *	Test condition "0005" for isIp38201ReturnCode000588()
	 *	@return  Returns true if isIp38201ReturnCode000588() is "0005"
	 */
   public boolean isIp38201ReturnCode000588() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00058888Value)  == 0  );
   }


	/**
	*  set values "0005"
	*/
   	public void setIp38201ReturnCode000588True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00058888Value);
   	}
	char[] ip38201ReturnCode00068888Value = "0006".toCharArray();
	/**
	 *	Test condition "0006" for isIp38201ReturnCode000688()
	 *	@return  Returns true if isIp38201ReturnCode000688() is "0006"
	 */
   public boolean isIp38201ReturnCode000688() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00068888Value)  == 0  );
   }


	/**
	*  set values "0006"
	*/
   	public void setIp38201ReturnCode000688True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00068888Value);
   	}
	char[] ip38201ReturnCode00078888Value = "0007".toCharArray();
	/**
	 *	Test condition "0007" for isIp38201ReturnCode000788()
	 *	@return  Returns true if isIp38201ReturnCode000788() is "0007"
	 */
   public boolean isIp38201ReturnCode000788() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00078888Value)  == 0  );
   }


	/**
	*  set values "0007"
	*/
   	public void setIp38201ReturnCode000788True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00078888Value);
   	}
	char[] ip38201ReturnCode00088888Value = "0008".toCharArray();
	/**
	 *	Test condition "0008" for isIp38201ReturnCode000888()
	 *	@return  Returns true if isIp38201ReturnCode000888() is "0008"
	 */
   public boolean isIp38201ReturnCode000888() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00088888Value)  == 0  );
   }


	/**
	*  set values "0008"
	*/
   	public void setIp38201ReturnCode000888True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00088888Value);
   	}
	char[] ip38201ReturnCode00098888Value = "0009".toCharArray();
	/**
	 *	Test condition "0009" for isIp38201ReturnCode000988()
	 *	@return  Returns true if isIp38201ReturnCode000988() is "0009"
	 */
   public boolean isIp38201ReturnCode000988() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00098888Value)  == 0  );
   }


	/**
	*  set values "0009"
	*/
   	public void setIp38201ReturnCode000988True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00098888Value);
   	}
	char[] ip38201ReturnCode00108888Value = "0010".toCharArray();
	/**
	 *	Test condition "0010" for isIp38201ReturnCode001088()
	 *	@return  Returns true if isIp38201ReturnCode001088() is "0010"
	 */
   public boolean isIp38201ReturnCode001088() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00108888Value)  == 0  );
   }


	/**
	*  set values "0010"
	*/
   	public void setIp38201ReturnCode001088True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00108888Value);
   	}
	char[] ip38201ReturnCode00118888Value = "0011".toCharArray();
	/**
	 *	Test condition "0011" for isIp38201ReturnCode001188()
	 *	@return  Returns true if isIp38201ReturnCode001188() is "0011"
	 */
   public boolean isIp38201ReturnCode001188() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00118888Value)  == 0  );
   }


	/**
	*  set values "0011"
	*/
   	public void setIp38201ReturnCode001188True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00118888Value);
   	}
	char[] ip38201ReturnCode00128888Value = "0012".toCharArray();
	/**
	 *	Test condition "0012" for isIp38201ReturnCode001288()
	 *	@return  Returns true if isIp38201ReturnCode001288() is "0012"
	 */
   public boolean isIp38201ReturnCode001288() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00128888Value)  == 0  );
   }


	/**
	*  set values "0012"
	*/
   	public void setIp38201ReturnCode001288True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00128888Value);
   	}
	char[] ip38201ReturnCode00138888Value = "0013".toCharArray();
	/**
	 *	Test condition "0013" for isIp38201ReturnCode001388()
	 *	@return  Returns true if isIp38201ReturnCode001388() is "0013"
	 */
   public boolean isIp38201ReturnCode001388() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00138888Value)  == 0  );
   }


	/**
	*  set values "0013"
	*/
   	public void setIp38201ReturnCode001388True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00138888Value);
   	}
	char[] ip38201ReturnCode00148888Value = "0014".toCharArray();
	/**
	 *	Test condition "0014" for isIp38201ReturnCode001488()
	 *	@return  Returns true if isIp38201ReturnCode001488() is "0014"
	 */
   public boolean isIp38201ReturnCode001488() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00148888Value)  == 0  );
   }


	/**
	*  set values "0014"
	*/
   	public void setIp38201ReturnCode001488True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00148888Value);
   	}
	char[] ip38201ReturnCode00158888Value = "0015".toCharArray();
	/**
	 *	Test condition "0015" for isIp38201ReturnCode001588()
	 *	@return  Returns true if isIp38201ReturnCode001588() is "0015"
	 */
   public boolean isIp38201ReturnCode001588() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00158888Value)  == 0  );
   }


	/**
	*  set values "0015"
	*/
   	public void setIp38201ReturnCode001588True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00158888Value);
   	}
	char[] ip38201ReturnCode00168888Value = "0016".toCharArray();
	/**
	 *	Test condition "0016" for isIp38201ReturnCode001688()
	 *	@return  Returns true if isIp38201ReturnCode001688() is "0016"
	 */
   public boolean isIp38201ReturnCode001688() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00168888Value)  == 0  );
   }


	/**
	*  set values "0016"
	*/
   	public void setIp38201ReturnCode001688True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00168888Value);
   	}
	char[] ip38201ReturnCode00178888Value = "0017".toCharArray();
	/**
	 *	Test condition "0017" for isIp38201ReturnCode001788()
	 *	@return  Returns true if isIp38201ReturnCode001788() is "0017"
	 */
   public boolean isIp38201ReturnCode001788() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00178888Value)  == 0  );
   }


	/**
	*  set values "0017"
	*/
   	public void setIp38201ReturnCode001788True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00178888Value);
   	}
	char[] ip38201ReturnCode00188888Value = "0018".toCharArray();
	/**
	 *	Test condition "0018" for isIp38201ReturnCode001888()
	 *	@return  Returns true if isIp38201ReturnCode001888() is "0018"
	 */
   public boolean isIp38201ReturnCode001888() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00188888Value)  == 0  );
   }


	/**
	*  set values "0018"
	*/
   	public void setIp38201ReturnCode001888True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00188888Value);
   	}
	char[] ip38201ReturnCode00198888Value = "0019".toCharArray();
	/**
	 *	Test condition "0019" for isIp38201ReturnCode001988()
	 *	@return  Returns true if isIp38201ReturnCode001988() is "0019"
	 */
   public boolean isIp38201ReturnCode001988() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00198888Value)  == 0  );
   }


	/**
	*  set values "0019"
	*/
   	public void setIp38201ReturnCode001988True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00198888Value);
   	}
	char[] ip38201ReturnCode00208888Value = "0020".toCharArray();
	/**
	 *	Test condition "0020" for isIp38201ReturnCode002088()
	 *	@return  Returns true if isIp38201ReturnCode002088() is "0020"
	 */
   public boolean isIp38201ReturnCode002088() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00208888Value)  == 0  );
   }


	/**
	*  set values "0020"
	*/
   	public void setIp38201ReturnCode002088True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00208888Value);
   	}
	char[] ip38201ReturnCode00218888Value = "0021".toCharArray();
	/**
	 *	Test condition "0021" for isIp38201ReturnCode002188()
	 *	@return  Returns true if isIp38201ReturnCode002188() is "0021"
	 */
   public boolean isIp38201ReturnCode002188() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00218888Value)  == 0  );
   }


	/**
	*  set values "0021"
	*/
   	public void setIp38201ReturnCode002188True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00218888Value);
   	}
	char[] ip38201ReturnCode00228888Value = "0022".toCharArray();
	/**
	 *	Test condition "0022" for isIp38201ReturnCode002288()
	 *	@return  Returns true if isIp38201ReturnCode002288() is "0022"
	 */
   public boolean isIp38201ReturnCode002288() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00228888Value)  == 0  );
   }


	/**
	*  set values "0022"
	*/
   	public void setIp38201ReturnCode002288True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00228888Value);
   	}
	char[] ip38201ReturnCode00238888Value = "0023".toCharArray();
	/**
	 *	Test condition "0023" for isIp38201ReturnCode002388()
	 *	@return  Returns true if isIp38201ReturnCode002388() is "0023"
	 */
   public boolean isIp38201ReturnCode002388() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00238888Value)  == 0  );
   }


	/**
	*  set values "0023"
	*/
   	public void setIp38201ReturnCode002388True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00238888Value);
   	}
	char[] ip38201ReturnCode00248888Value = "0024".toCharArray();
	/**
	 *	Test condition "0024" for isIp38201ReturnCode002488()
	 *	@return  Returns true if isIp38201ReturnCode002488() is "0024"
	 */
   public boolean isIp38201ReturnCode002488() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00248888Value)  == 0  );
   }


	/**
	*  set values "0024"
	*/
   	public void setIp38201ReturnCode002488True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00248888Value);
   	}
	char[] ip38201ReturnCode00258888Value = "0025".toCharArray();
	/**
	 *	Test condition "0025" for isIp38201ReturnCode002588()
	 *	@return  Returns true if isIp38201ReturnCode002588() is "0025"
	 */
   public boolean isIp38201ReturnCode002588() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00258888Value)  == 0  );
   }


	/**
	*  set values "0025"
	*/
   	public void setIp38201ReturnCode002588True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00258888Value);
   	}
	char[] ip38201ReturnCode00268888Value = "0026".toCharArray();
	/**
	 *	Test condition "0026" for isIp38201ReturnCode002688()
	 *	@return  Returns true if isIp38201ReturnCode002688() is "0026"
	 */
   public boolean isIp38201ReturnCode002688() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00268888Value)  == 0  );
   }


	/**
	*  set values "0026"
	*/
   	public void setIp38201ReturnCode002688True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00268888Value);
   	}
	char[] ip38201ReturnCode00278888Value = "0027".toCharArray();
	/**
	 *	Test condition "0027" for isIp38201ReturnCode002788()
	 *	@return  Returns true if isIp38201ReturnCode002788() is "0027"
	 */
   public boolean isIp38201ReturnCode002788() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00278888Value)  == 0  );
   }


	/**
	*  set values "0027"
	*/
   	public void setIp38201ReturnCode002788True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00278888Value);
   	}
	char[] ip38201ReturnCode00288888Value = "0028".toCharArray();
	/**
	 *	Test condition "0028" for isIp38201ReturnCode002888()
	 *	@return  Returns true if isIp38201ReturnCode002888() is "0028"
	 */
   public boolean isIp38201ReturnCode002888() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00288888Value)  == 0  );
   }


	/**
	*  set values "0028"
	*/
   	public void setIp38201ReturnCode002888True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00288888Value);
   	}
	char[] ip38201ReturnCode00298888Value = "0029".toCharArray();
	/**
	 *	Test condition "0029" for isIp38201ReturnCode002988()
	 *	@return  Returns true if isIp38201ReturnCode002988() is "0029"
	 */
   public boolean isIp38201ReturnCode002988() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00298888Value)  == 0  );
   }


	/**
	*  set values "0029"
	*/
   	public void setIp38201ReturnCode002988True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00298888Value);
   	}
	char[] ip38201ReturnCode00308888Value = "0030".toCharArray();
	/**
	 *	Test condition "0030" for isIp38201ReturnCode003088()
	 *	@return  Returns true if isIp38201ReturnCode003088() is "0030"
	 */
   public boolean isIp38201ReturnCode003088() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00308888Value)  == 0  );
   }


	/**
	*  set values "0030"
	*/
   	public void setIp38201ReturnCode003088True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00308888Value);
   	}
	char[] ip38201ReturnCode00318888Value = "0031".toCharArray();
	/**
	 *	Test condition "0031" for isIp38201ReturnCode003188()
	 *	@return  Returns true if isIp38201ReturnCode003188() is "0031"
	 */
   public boolean isIp38201ReturnCode003188() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00318888Value)  == 0  );
   }


	/**
	*  set values "0031"
	*/
   	public void setIp38201ReturnCode003188True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00318888Value);
   	}
	char[] ip38201ReturnCode00328888Value = "0032".toCharArray();
	/**
	 *	Test condition "0032" for isIp38201ReturnCode003288()
	 *	@return  Returns true if isIp38201ReturnCode003288() is "0032"
	 */
   public boolean isIp38201ReturnCode003288() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00328888Value)  == 0  );
   }


	/**
	*  set values "0032"
	*/
   	public void setIp38201ReturnCode003288True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00328888Value);
   	}
	char[] ip38201ReturnCode00338888Value = "0033".toCharArray();
	/**
	 *	Test condition "0033" for isIp38201ReturnCode003388()
	 *	@return  Returns true if isIp38201ReturnCode003388() is "0033"
	 */
   public boolean isIp38201ReturnCode003388() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00338888Value)  == 0  );
   }


	/**
	*  set values "0033"
	*/
   	public void setIp38201ReturnCode003388True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00338888Value);
   	}
	char[] ip38201ReturnCode00348888Value = "0034".toCharArray();
	/**
	 *	Test condition "0034" for isIp38201ReturnCode003488()
	 *	@return  Returns true if isIp38201ReturnCode003488() is "0034"
	 */
   public boolean isIp38201ReturnCode003488() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00348888Value)  == 0  );
   }


	/**
	*  set values "0034"
	*/
   	public void setIp38201ReturnCode003488True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00348888Value);
   	}
	char[] ip38201ReturnCode00358888Value = "0035".toCharArray();
	/**
	 *	Test condition "0035" for isIp38201ReturnCode003588()
	 *	@return  Returns true if isIp38201ReturnCode003588() is "0035"
	 */
   public boolean isIp38201ReturnCode003588() throws CFException {
      return (  compareChars( getIp38201ReturnCode() , ip38201ReturnCode00358888Value)  == 0  );
   }


	/**
	*  set values "0035"
	*/
   	public void setIp38201ReturnCode003588True() {  			
    	setIp38201ReturnCode( ip38201ReturnCode00358888Value);
   	}
	/**
	 *	Returns the value of ip38201Filler
	 *	@return ip38201Filler
	 */
   public char[] getIp38201Filler() throws CFException{
     if (isIp38201FillerModified()) { 
        ip38201Filler = refreshIp38201Filler();
     }
   		return ip38201Filler;
   }

  
	/**
	*  set variable ip38201Filler
	*  Corresponding COBOL Variable is IP38201-FILLER
	*  @param value
	**/
   public void setIp38201Filler(char[] value) {
      ip38201Filler = checkIp38201FillerConstraints(value);
      serializeIp38201Filler(ip38201Filler);
   } 

     /**
	 * 	Update Ip38201Filler 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp38201Filler(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp38201Filler,ip38201Filler.length);
   	
   }
   
   public void setIp38201Filler(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201Filler,ip38201Filler.length);
   	
   }
   
     /**
	 * 	Update Ip38201Filler 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201Filler(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201Filler+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip38201Filler with another Field
	 *	@param value
	 */
   public void setIp38201Filler(Field source) {
       replace(source,0,source.length(),beginIp38201Filler,IP_38201_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip38201Filler 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp38201Filler(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp38201Filler,IP_38201_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip38201Filler 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201Filler(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201Filler+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip38201McidynamParms
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp38201Function(CONSTANTS.SPACE);
         setIp38201Dd(CONSTANTS.SPACE_8);
         setIp38201Dsn(CONSTANTS.SPACE_44);
          ip38201Disposition.initialize();
     
          ip38201AllocateParms.initialize();
     
         setIp38201ReturnCode(CONSTANTS.SPACE_4);
         setIp38201Filler(CONSTANTS.SPACE_25);
   }

		public static int getIp38201McidynamParmsFieldLength() {
			return IP_38201_MCIDYNAM_PARMS_LENGTH;
		}

}
  
