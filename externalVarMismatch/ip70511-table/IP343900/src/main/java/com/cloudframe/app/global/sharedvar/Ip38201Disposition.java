package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip38201Disposition is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip38201Disposition extends Ip38201DispositionSerialized { 
   

						private char[] ip38201DispBeginParm = Field.fillLowValue(1);

						private char[] ip38201DispNormalParm = Field.fillLowValue(1);

						private char[] ip38201DispAbnormalParm = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip38201Disposition
	**/
    public Ip38201Disposition() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip38201Disposition. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip38201Disposition(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip38201DispBeginParm
	 *	@return ip38201DispBeginParm
	 */
   public char[] getIp38201DispBeginParm() throws CFException{
     if (isIp38201DispBeginParmModified()) { 
        ip38201DispBeginParm = refreshIp38201DispBeginParm();
     }
   		return ip38201DispBeginParm;
   }

  
	/**
	*  set variable ip38201DispBeginParm
	*  Corresponding COBOL Variable is IP38201-DISP-BEGIN-PARM
	*  @param value
	**/
   public void setIp38201DispBeginParm(char[] value) {
      ip38201DispBeginParm = checkIp38201DispBeginParmConstraints(value);
      serializeIp38201DispBeginParm(ip38201DispBeginParm);
   } 

     /**
	 * 	Update Ip38201DispBeginParm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp38201DispBeginParm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp38201DispBeginParm,ip38201DispBeginParm.length);
   	
   }
   
   public void setIp38201DispBeginParm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201DispBeginParm,ip38201DispBeginParm.length);
   	
   }
   
     /**
	 * 	Update Ip38201DispBeginParm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201DispBeginParm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201DispBeginParm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip38201DispBeginParm with another Field
	 *	@param value
	 */
   public void setIp38201DispBeginParm(Field source) {
       replace(source,0,source.length(),beginIp38201DispBeginParm,IP_38201_DISP_BEGIN_PARM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip38201DispBeginParm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp38201DispBeginParm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp38201DispBeginParm,IP_38201_DISP_BEGIN_PARM_LEN);
   	
   }
   
     /**
	 * 	Update Ip38201DispBeginParm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201DispBeginParm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201DispBeginParm+targetIndex,targetLen);
    
   }
	char[] dispBeginNew8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isDispBeginNew88()
	 *	@return  Returns true if isDispBeginNew88() is "N"
	 */
   public boolean isDispBeginNew88() throws CFException {
      return (  compareChars( getIp38201DispBeginParm() , dispBeginNew8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setDispBeginNew88True() {  			
    	setIp38201DispBeginParm( dispBeginNew8888Value);
   	}
	char[] dispBeginShr8888Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isDispBeginShr88()
	 *	@return  Returns true if isDispBeginShr88() is "S"
	 */
   public boolean isDispBeginShr88() throws CFException {
      return (  compareChars( getIp38201DispBeginParm() , dispBeginShr8888Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setDispBeginShr88True() {  			
    	setIp38201DispBeginParm( dispBeginShr8888Value);
   	}
	char[] dispBeginMod8888Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isDispBeginMod88()
	 *	@return  Returns true if isDispBeginMod88() is "M"
	 */
   public boolean isDispBeginMod88() throws CFException {
      return (  compareChars( getIp38201DispBeginParm() , dispBeginMod8888Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setDispBeginMod88True() {  			
    	setIp38201DispBeginParm( dispBeginMod8888Value);
   	}
	char[] dispBeginOld8888Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isDispBeginOld88()
	 *	@return  Returns true if isDispBeginOld88() is "O"
	 */
   public boolean isDispBeginOld88() throws CFException {
      return (  compareChars( getIp38201DispBeginParm() , dispBeginOld8888Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setDispBeginOld88True() {  			
    	setIp38201DispBeginParm( dispBeginOld8888Value);
   	}
	char[] dispBeginValid8888Value1 = "N".toCharArray();
char[] dispBeginValid8888Value2 = "S".toCharArray();
char[] dispBeginValid8888Value3 = "M".toCharArray();
char[] dispBeginValid8888Value4 = "O".toCharArray();

	/**
	 *	Test condition "N" "S" "M" "O" for isDispBeginValid88()
	 *	@return  Returns true if isDispBeginValid88() is "N" "S" "M" "O"
	 */
   public boolean isDispBeginValid88() throws CFException {
      return (  compareChars( getIp38201DispBeginParm() , dispBeginValid8888Value1)  == 0  ||  compareChars( getIp38201DispBeginParm() , dispBeginValid8888Value2)  == 0  ||  compareChars( getIp38201DispBeginParm() , dispBeginValid8888Value3)  == 0  ||  compareChars( getIp38201DispBeginParm() , dispBeginValid8888Value4)  == 0  );
   }


	/**
	*  set values "N" "S" "M" "O"
	*/
   	public void setDispBeginValid88True() {  			
    	setIp38201DispBeginParm( dispBeginValid8888Value1);
   	}
	/**
	 *	Returns the value of ip38201DispNormalParm
	 *	@return ip38201DispNormalParm
	 */
   public char[] getIp38201DispNormalParm() throws CFException{
     if (isIp38201DispNormalParmModified()) { 
        ip38201DispNormalParm = refreshIp38201DispNormalParm();
     }
   		return ip38201DispNormalParm;
   }

  
	/**
	*  set variable ip38201DispNormalParm
	*  Corresponding COBOL Variable is IP38201-DISP-NORMAL-PARM
	*  @param value
	**/
   public void setIp38201DispNormalParm(char[] value) {
      ip38201DispNormalParm = checkIp38201DispNormalParmConstraints(value);
      serializeIp38201DispNormalParm(ip38201DispNormalParm);
   } 

     /**
	 * 	Update Ip38201DispNormalParm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp38201DispNormalParm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp38201DispNormalParm,ip38201DispNormalParm.length);
   	
   }
   
   public void setIp38201DispNormalParm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201DispNormalParm,ip38201DispNormalParm.length);
   	
   }
   
     /**
	 * 	Update Ip38201DispNormalParm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201DispNormalParm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201DispNormalParm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip38201DispNormalParm with another Field
	 *	@param value
	 */
   public void setIp38201DispNormalParm(Field source) {
       replace(source,0,source.length(),beginIp38201DispNormalParm,IP_38201_DISP_NORMAL_PARM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip38201DispNormalParm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp38201DispNormalParm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp38201DispNormalParm,IP_38201_DISP_NORMAL_PARM_LEN);
   	
   }
   
     /**
	 * 	Update Ip38201DispNormalParm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201DispNormalParm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201DispNormalParm+targetIndex,targetLen);
    
   }
	char[] dispNormalCatlg8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isDispNormalCatlg88()
	 *	@return  Returns true if isDispNormalCatlg88() is "C"
	 */
   public boolean isDispNormalCatlg88() throws CFException {
      return (  compareChars( getIp38201DispNormalParm() , dispNormalCatlg8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setDispNormalCatlg88True() {  			
    	setIp38201DispNormalParm( dispNormalCatlg8888Value);
   	}
	char[] dispNormalKeep8888Value = "K".toCharArray();
	/**
	 *	Test condition "K" for isDispNormalKeep88()
	 *	@return  Returns true if isDispNormalKeep88() is "K"
	 */
   public boolean isDispNormalKeep88() throws CFException {
      return (  compareChars( getIp38201DispNormalParm() , dispNormalKeep8888Value)  == 0  );
   }


	/**
	*  set values "K"
	*/
   	public void setDispNormalKeep88True() {  			
    	setIp38201DispNormalParm( dispNormalKeep8888Value);
   	}
	char[] dispNormalDelete8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isDispNormalDelete88()
	 *	@return  Returns true if isDispNormalDelete88() is "D"
	 */
   public boolean isDispNormalDelete88() throws CFException {
      return (  compareChars( getIp38201DispNormalParm() , dispNormalDelete8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setDispNormalDelete88True() {  			
    	setIp38201DispNormalParm( dispNormalDelete8888Value);
   	}
	char[] dispNormalPass8888Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isDispNormalPass88()
	 *	@return  Returns true if isDispNormalPass88() is "P"
	 */
   public boolean isDispNormalPass88() throws CFException {
      return (  compareChars( getIp38201DispNormalParm() , dispNormalPass8888Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setDispNormalPass88True() {  			
    	setIp38201DispNormalParm( dispNormalPass8888Value);
   	}
	char[] dispNormalUncatlg8888Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isDispNormalUncatlg88()
	 *	@return  Returns true if isDispNormalUncatlg88() is "U"
	 */
   public boolean isDispNormalUncatlg88() throws CFException {
      return (  compareChars( getIp38201DispNormalParm() , dispNormalUncatlg8888Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setDispNormalUncatlg88True() {  			
    	setIp38201DispNormalParm( dispNormalUncatlg8888Value);
   	}
	char[] dispNormalValid8888Value1 = "C".toCharArray();
char[] dispNormalValid8888Value2 = "K".toCharArray();
char[] dispNormalValid8888Value3 = "D".toCharArray();
char[] dispNormalValid8888Value4 = "P".toCharArray();
char[] dispNormalValid8888Value5 = "U".toCharArray();

	/**
	 *	Test condition "C" "K" "D" "P" "U" for isDispNormalValid88()
	 *	@return  Returns true if isDispNormalValid88() is "C" "K" "D" "P" "U"
	 */
   public boolean isDispNormalValid88() throws CFException {
      return (  compareChars( getIp38201DispNormalParm() , dispNormalValid8888Value1)  == 0  ||  compareChars( getIp38201DispNormalParm() , dispNormalValid8888Value2)  == 0  ||  compareChars( getIp38201DispNormalParm() , dispNormalValid8888Value3)  == 0  ||  compareChars( getIp38201DispNormalParm() , dispNormalValid8888Value4)  == 0  ||  compareChars( getIp38201DispNormalParm() , dispNormalValid8888Value5)  == 0  );
   }


	/**
	*  set values "C" "K" "D" "P" "U"
	*/
   	public void setDispNormalValid88True() {  			
    	setIp38201DispNormalParm( dispNormalValid8888Value1);
   	}
	char[] dispNormalBlank8888Value = " ".toCharArray();
	/**
	 *	Test condition " " for isDispNormalBlank88()
	 *	@return  Returns true if isDispNormalBlank88() is " "
	 */
   public boolean isDispNormalBlank88() throws CFException {
      return (  compareChars( getIp38201DispNormalParm() , dispNormalBlank8888Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setDispNormalBlank88True() {  			
    	setIp38201DispNormalParm( dispNormalBlank8888Value);
   	}
	/**
	 *	Returns the value of ip38201DispAbnormalParm
	 *	@return ip38201DispAbnormalParm
	 */
   public char[] getIp38201DispAbnormalParm() throws CFException{
     if (isIp38201DispAbnormalParmModified()) { 
        ip38201DispAbnormalParm = refreshIp38201DispAbnormalParm();
     }
   		return ip38201DispAbnormalParm;
   }

  
	/**
	*  set variable ip38201DispAbnormalParm
	*  Corresponding COBOL Variable is IP38201-DISP-ABNORMAL-PARM
	*  @param value
	**/
   public void setIp38201DispAbnormalParm(char[] value) {
      ip38201DispAbnormalParm = checkIp38201DispAbnormalParmConstraints(value);
      serializeIp38201DispAbnormalParm(ip38201DispAbnormalParm);
   } 

     /**
	 * 	Update Ip38201DispAbnormalParm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp38201DispAbnormalParm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp38201DispAbnormalParm,ip38201DispAbnormalParm.length);
   	
   }
   
   public void setIp38201DispAbnormalParm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201DispAbnormalParm,ip38201DispAbnormalParm.length);
   	
   }
   
     /**
	 * 	Update Ip38201DispAbnormalParm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp38201DispAbnormalParm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201DispAbnormalParm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip38201DispAbnormalParm with another Field
	 *	@param value
	 */
   public void setIp38201DispAbnormalParm(Field source) {
       replace(source,0,source.length(),beginIp38201DispAbnormalParm,IP_38201_DISP_ABNORMAL_PARM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip38201DispAbnormalParm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp38201DispAbnormalParm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp38201DispAbnormalParm,IP_38201_DISP_ABNORMAL_PARM_LEN);
   	
   }
   
     /**
	 * 	Update Ip38201DispAbnormalParm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp38201DispAbnormalParm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp38201DispAbnormalParm+targetIndex,targetLen);
    
   }
	char[] dispAbnormalDelete8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isDispAbnormalDelete88()
	 *	@return  Returns true if isDispAbnormalDelete88() is "D"
	 */
   public boolean isDispAbnormalDelete88() throws CFException {
      return (  compareChars( getIp38201DispAbnormalParm() , dispAbnormalDelete8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setDispAbnormalDelete88True() {  			
    	setIp38201DispAbnormalParm( dispAbnormalDelete8888Value);
   	}
	char[] dispAbnormalCatlg8888Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isDispAbnormalCatlg88()
	 *	@return  Returns true if isDispAbnormalCatlg88() is "C"
	 */
   public boolean isDispAbnormalCatlg88() throws CFException {
      return (  compareChars( getIp38201DispAbnormalParm() , dispAbnormalCatlg8888Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setDispAbnormalCatlg88True() {  			
    	setIp38201DispAbnormalParm( dispAbnormalCatlg8888Value);
   	}
	char[] dispAbnormalUncatlg8888Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isDispAbnormalUncatlg88()
	 *	@return  Returns true if isDispAbnormalUncatlg88() is "U"
	 */
   public boolean isDispAbnormalUncatlg88() throws CFException {
      return (  compareChars( getIp38201DispAbnormalParm() , dispAbnormalUncatlg8888Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setDispAbnormalUncatlg88True() {  			
    	setIp38201DispAbnormalParm( dispAbnormalUncatlg8888Value);
   	}
	char[] dispAbnormalKeep8888Value = "K".toCharArray();
	/**
	 *	Test condition "K" for isDispAbnormalKeep88()
	 *	@return  Returns true if isDispAbnormalKeep88() is "K"
	 */
   public boolean isDispAbnormalKeep88() throws CFException {
      return (  compareChars( getIp38201DispAbnormalParm() , dispAbnormalKeep8888Value)  == 0  );
   }


	/**
	*  set values "K"
	*/
   	public void setDispAbnormalKeep88True() {  			
    	setIp38201DispAbnormalParm( dispAbnormalKeep8888Value);
   	}
	char[] dispAbnormalValid8888Value1 = "D".toCharArray();
char[] dispAbnormalValid8888Value2 = "C".toCharArray();
char[] dispAbnormalValid8888Value3 = "U".toCharArray();
char[] dispAbnormalValid8888Value4 = "K".toCharArray();

	/**
	 *	Test condition "D" "C" "U" "K" for isDispAbnormalValid88()
	 *	@return  Returns true if isDispAbnormalValid88() is "D" "C" "U" "K"
	 */
   public boolean isDispAbnormalValid88() throws CFException {
      return (  compareChars( getIp38201DispAbnormalParm() , dispAbnormalValid8888Value1)  == 0  ||  compareChars( getIp38201DispAbnormalParm() , dispAbnormalValid8888Value2)  == 0  ||  compareChars( getIp38201DispAbnormalParm() , dispAbnormalValid8888Value3)  == 0  ||  compareChars( getIp38201DispAbnormalParm() , dispAbnormalValid8888Value4)  == 0  );
   }


	/**
	*  set values "D" "C" "U" "K"
	*/
   	public void setDispAbnormalValid88True() {  			
    	setIp38201DispAbnormalParm( dispAbnormalValid8888Value1);
   	}
	char[] dispAbnormalBlank8888Value = " ".toCharArray();
	/**
	 *	Test condition " " for isDispAbnormalBlank88()
	 *	@return  Returns true if isDispAbnormalBlank88() is " "
	 */
   public boolean isDispAbnormalBlank88() throws CFException {
      return (  compareChars( getIp38201DispAbnormalParm() , dispAbnormalBlank8888Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setDispAbnormalBlank88True() {  			
    	setIp38201DispAbnormalParm( dispAbnormalBlank8888Value);
   	}

	
	
	
	/**
	 * 	initializes Ip38201Disposition
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp38201DispBeginParm(CONSTANTS.SPACE);
         setIp38201DispNormalParm(CONSTANTS.SPACE);
         setIp38201DispAbnormalParm(CONSTANTS.SPACE);
   }

		public static int getIp38201DispositionFieldLength() {
			return IP_38201_DISPOSITION_LENGTH;
		}

}
  
