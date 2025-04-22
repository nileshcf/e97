package com.cloudframe.app.db2func.dto;

/**
*  The class HostAppCodeTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HostAppCodeTbl extends HostAppCodeTblSerialized { 
   

						private char[] hostAppCode01 = Field.fillLowValue(3);

						private char[] hostAppCode02 = Field.fillLowValue(3);

						private char[] hostAppCode03 = Field.fillLowValue(3);

						private char[] hostAppCode04 = Field.fillLowValue(3);

						private char[] hostAppCode05 = Field.fillLowValue(3);

						private char[] hostAppCode06 = Field.fillLowValue(3);

						private char[] hostAppCode07 = Field.fillLowValue(3);
	
	/**
	* Constructor for HostAppCodeTbl
	**/
    public HostAppCodeTbl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for HostAppCodeTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HostAppCodeTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of hostAppCode01
	 *	@return hostAppCode01
	 */
   public char[] getHostAppCode01() throws CFException{
     if (isHostAppCode01Modified()) { 
        hostAppCode01 = refreshHostAppCode01();
     }
   		return hostAppCode01;
   }

  
	/**
	*  set variable hostAppCode01
	*  Corresponding COBOL Variable is WS-HOST-APP-CODE-01
	*  @param value
	**/
   public void setHostAppCode01(char[] value) {
      hostAppCode01 = checkHostAppCode01Constraints(value);
      serializeHostAppCode01(hostAppCode01);
   } 

     /**
	 * 	Update HostAppCode01 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHostAppCode01(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHostAppCode01,hostAppCode01.length);
   	
   }
   
   public void setHostAppCode01(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode01,hostAppCode01.length);
   	
   }
   
     /**
	 * 	Update HostAppCode01 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode01+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HostAppCode01 with another Field
	 *	@param value
	 */
   public void setHostAppCode01(Field source) {
       replace(source,0,source.length(),beginHostAppCode01,HOST_APP_CODE_01_LEN);
   	
   }  
   
     /**
	 * 	Update HostAppCode01 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHostAppCode01(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHostAppCode01,HOST_APP_CODE_01_LEN);
   	
   }
   
     /**
	 * 	Update HostAppCode01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode01+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hostAppCode02
	 *	@return hostAppCode02
	 */
   public char[] getHostAppCode02() throws CFException{
     if (isHostAppCode02Modified()) { 
        hostAppCode02 = refreshHostAppCode02();
     }
   		return hostAppCode02;
   }

  
	/**
	*  set variable hostAppCode02
	*  Corresponding COBOL Variable is WS-HOST-APP-CODE-02
	*  @param value
	**/
   public void setHostAppCode02(char[] value) {
      hostAppCode02 = checkHostAppCode02Constraints(value);
      serializeHostAppCode02(hostAppCode02);
   } 

     /**
	 * 	Update HostAppCode02 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHostAppCode02(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHostAppCode02,hostAppCode02.length);
   	
   }
   
   public void setHostAppCode02(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode02,hostAppCode02.length);
   	
   }
   
     /**
	 * 	Update HostAppCode02 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode02(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode02+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HostAppCode02 with another Field
	 *	@param value
	 */
   public void setHostAppCode02(Field source) {
       replace(source,0,source.length(),beginHostAppCode02,HOST_APP_CODE_02_LEN);
   	
   }  
   
     /**
	 * 	Update HostAppCode02 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHostAppCode02(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHostAppCode02,HOST_APP_CODE_02_LEN);
   	
   }
   
     /**
	 * 	Update HostAppCode02 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode02(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode02+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hostAppCode03
	 *	@return hostAppCode03
	 */
   public char[] getHostAppCode03() throws CFException{
     if (isHostAppCode03Modified()) { 
        hostAppCode03 = refreshHostAppCode03();
     }
   		return hostAppCode03;
   }

  
	/**
	*  set variable hostAppCode03
	*  Corresponding COBOL Variable is WS-HOST-APP-CODE-03
	*  @param value
	**/
   public void setHostAppCode03(char[] value) {
      hostAppCode03 = checkHostAppCode03Constraints(value);
      serializeHostAppCode03(hostAppCode03);
   } 

     /**
	 * 	Update HostAppCode03 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHostAppCode03(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHostAppCode03,hostAppCode03.length);
   	
   }
   
   public void setHostAppCode03(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode03,hostAppCode03.length);
   	
   }
   
     /**
	 * 	Update HostAppCode03 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode03(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode03+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HostAppCode03 with another Field
	 *	@param value
	 */
   public void setHostAppCode03(Field source) {
       replace(source,0,source.length(),beginHostAppCode03,HOST_APP_CODE_03_LEN);
   	
   }  
   
     /**
	 * 	Update HostAppCode03 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHostAppCode03(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHostAppCode03,HOST_APP_CODE_03_LEN);
   	
   }
   
     /**
	 * 	Update HostAppCode03 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode03(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode03+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hostAppCode04
	 *	@return hostAppCode04
	 */
   public char[] getHostAppCode04() throws CFException{
     if (isHostAppCode04Modified()) { 
        hostAppCode04 = refreshHostAppCode04();
     }
   		return hostAppCode04;
   }

  
	/**
	*  set variable hostAppCode04
	*  Corresponding COBOL Variable is WS-HOST-APP-CODE-04
	*  @param value
	**/
   public void setHostAppCode04(char[] value) {
      hostAppCode04 = checkHostAppCode04Constraints(value);
      serializeHostAppCode04(hostAppCode04);
   } 

     /**
	 * 	Update HostAppCode04 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHostAppCode04(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHostAppCode04,hostAppCode04.length);
   	
   }
   
   public void setHostAppCode04(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode04,hostAppCode04.length);
   	
   }
   
     /**
	 * 	Update HostAppCode04 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode04(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode04+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HostAppCode04 with another Field
	 *	@param value
	 */
   public void setHostAppCode04(Field source) {
       replace(source,0,source.length(),beginHostAppCode04,HOST_APP_CODE_04_LEN);
   	
   }  
   
     /**
	 * 	Update HostAppCode04 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHostAppCode04(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHostAppCode04,HOST_APP_CODE_04_LEN);
   	
   }
   
     /**
	 * 	Update HostAppCode04 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode04(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode04+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hostAppCode05
	 *	@return hostAppCode05
	 */
   public char[] getHostAppCode05() throws CFException{
     if (isHostAppCode05Modified()) { 
        hostAppCode05 = refreshHostAppCode05();
     }
   		return hostAppCode05;
   }

  
	/**
	*  set variable hostAppCode05
	*  Corresponding COBOL Variable is WS-HOST-APP-CODE-05
	*  @param value
	**/
   public void setHostAppCode05(char[] value) {
      hostAppCode05 = checkHostAppCode05Constraints(value);
      serializeHostAppCode05(hostAppCode05);
   } 

     /**
	 * 	Update HostAppCode05 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHostAppCode05(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHostAppCode05,hostAppCode05.length);
   	
   }
   
   public void setHostAppCode05(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode05,hostAppCode05.length);
   	
   }
   
     /**
	 * 	Update HostAppCode05 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode05(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode05+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HostAppCode05 with another Field
	 *	@param value
	 */
   public void setHostAppCode05(Field source) {
       replace(source,0,source.length(),beginHostAppCode05,HOST_APP_CODE_05_LEN);
   	
   }  
   
     /**
	 * 	Update HostAppCode05 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHostAppCode05(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHostAppCode05,HOST_APP_CODE_05_LEN);
   	
   }
   
     /**
	 * 	Update HostAppCode05 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode05(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode05+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hostAppCode06
	 *	@return hostAppCode06
	 */
   public char[] getHostAppCode06() throws CFException{
     if (isHostAppCode06Modified()) { 
        hostAppCode06 = refreshHostAppCode06();
     }
   		return hostAppCode06;
   }

  
	/**
	*  set variable hostAppCode06
	*  Corresponding COBOL Variable is WS-HOST-APP-CODE-06
	*  @param value
	**/
   public void setHostAppCode06(char[] value) {
      hostAppCode06 = checkHostAppCode06Constraints(value);
      serializeHostAppCode06(hostAppCode06);
   } 

     /**
	 * 	Update HostAppCode06 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHostAppCode06(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHostAppCode06,hostAppCode06.length);
   	
   }
   
   public void setHostAppCode06(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode06,hostAppCode06.length);
   	
   }
   
     /**
	 * 	Update HostAppCode06 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode06(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode06+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HostAppCode06 with another Field
	 *	@param value
	 */
   public void setHostAppCode06(Field source) {
       replace(source,0,source.length(),beginHostAppCode06,HOST_APP_CODE_06_LEN);
   	
   }  
   
     /**
	 * 	Update HostAppCode06 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHostAppCode06(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHostAppCode06,HOST_APP_CODE_06_LEN);
   	
   }
   
     /**
	 * 	Update HostAppCode06 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode06(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode06+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hostAppCode07
	 *	@return hostAppCode07
	 */
   public char[] getHostAppCode07() throws CFException{
     if (isHostAppCode07Modified()) { 
        hostAppCode07 = refreshHostAppCode07();
     }
   		return hostAppCode07;
   }

  
	/**
	*  set variable hostAppCode07
	*  Corresponding COBOL Variable is WS-HOST-APP-CODE-07
	*  @param value
	**/
   public void setHostAppCode07(char[] value) {
      hostAppCode07 = checkHostAppCode07Constraints(value);
      serializeHostAppCode07(hostAppCode07);
   } 

     /**
	 * 	Update HostAppCode07 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHostAppCode07(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHostAppCode07,hostAppCode07.length);
   	
   }
   
   public void setHostAppCode07(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode07,hostAppCode07.length);
   	
   }
   
     /**
	 * 	Update HostAppCode07 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode07(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode07+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HostAppCode07 with another Field
	 *	@param value
	 */
   public void setHostAppCode07(Field source) {
       replace(source,0,source.length(),beginHostAppCode07,HOST_APP_CODE_07_LEN);
   	
   }  
   
     /**
	 * 	Update HostAppCode07 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHostAppCode07(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHostAppCode07,HOST_APP_CODE_07_LEN);
   	
   }
   
     /**
	 * 	Update HostAppCode07 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHostAppCode07(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHostAppCode07+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHostAppCodeTblFieldLength() {
			return HOST_APP_CODE_TBL_LENGTH;
		}

}
  
