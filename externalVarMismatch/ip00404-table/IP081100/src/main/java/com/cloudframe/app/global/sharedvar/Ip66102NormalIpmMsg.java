package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66102NormalIpmMsg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip66102NormalIpmMsg extends Ip66102NormalIpmMsgSerialized { 
   

						private char[] ip66102Mti = Field.fillLowValue(4);
				private Ip66102BitMap ip66102BitMap = new Ip66102BitMap();

	
	/**
	* Constructor for Ip66102NormalIpmMsg
	**/
    public Ip66102NormalIpmMsg() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip66102NormalIpmMsg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66102NormalIpmMsg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip66102BitMap.setParent(this,getStartOffset() + 4);
    } 

	/**
	 *	Returns the value of ip66102Mti
	 *	@return ip66102Mti
	 */
   public char[] getIp66102Mti() throws CFException{
     if (isIp66102MtiModified()) { 
        ip66102Mti = refreshIp66102Mti();
     }
   		return ip66102Mti;
   }

  
	/**
	*  set variable ip66102Mti
	*  Corresponding COBOL Variable is IP66102-MTI
	*  @param value
	**/
   public void setIp66102Mti(char[] value) {
      ip66102Mti = checkIp66102MtiConstraints(value);
      serializeIp66102Mti(ip66102Mti);
   } 

     /**
	 * 	Update Ip66102Mti 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp66102Mti(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp66102Mti,ip66102Mti.length);
   	
   }
   
   public void setIp66102Mti(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102Mti,ip66102Mti.length);
   	
   }
   
     /**
	 * 	Update Ip66102Mti 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102Mti(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102Mti+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip66102Mti with another Field
	 *	@param value
	 */
   public void setIp66102Mti(Field source) {
       replace(source,0,source.length(),beginIp66102Mti,IP_66102_MTI_LEN);
   	
   }  
   
     /**
	 * 	Update Ip66102Mti 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp66102Mti(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp66102Mti,IP_66102_MTI_LEN);
   	
   }
   
     /**
	 * 	Update Ip66102Mti 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102Mti(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp66102Mti+targetIndex,targetLen);
    
   }
	char[] ip66102MtiIsValid88Value1 = "1240".toCharArray();
char[] ip66102MtiIsValid88Value2 = "1442".toCharArray();
char[] ip66102MtiIsValid88Value3 = "1644".toCharArray();
char[] ip66102MtiIsValid88Value4 = "1740".toCharArray();
char[] ip66102MtiIsValid88Value5 = "1999".toCharArray();

	/**
	 *	Test condition "1240" "1442" "1644" "1740" "1999" for isIp66102MtiIsValid()
	 *	@return  Returns true if isIp66102MtiIsValid() is "1240" "1442" "1644" "1740" "1999"
	 */
   public boolean isIp66102MtiIsValid() throws CFException {
      return (  compareChars( getIp66102Mti() , ip66102MtiIsValid88Value1)  == 0  ||  compareChars( getIp66102Mti() , ip66102MtiIsValid88Value2)  == 0  ||  compareChars( getIp66102Mti() , ip66102MtiIsValid88Value3)  == 0  ||  compareChars( getIp66102Mti() , ip66102MtiIsValid88Value4)  == 0  ||  compareChars( getIp66102Mti() , ip66102MtiIsValid88Value5)  == 0  );
   }


	/**
	*  set values "1240" "1442" "1644" "1740" "1999"
	*/
   	public void setIp66102MtiIsValidTrue() {  			
    	setIp66102Mti( ip66102MtiIsValid88Value1);
   	}
	/**
	 *	Returns the value of ip66102BitMap
	 *	@return ip66102BitMap
	 */   
	 public Ip66102BitMap getIp66102BitMap() {
   	return ip66102BitMap;
   }
   /**
	* 	Update Ip66102BitMap with the passed value
	*   Corresponding COBOL Variable is IP66102-BIT-MAP
	*	@param value
	*/
   public void setIp66102BitMap(char[] value) {
      ip66102BitMap.setString(value); 
   }   
    
     /**
	 * 	Update Ip66102BitMap 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitMap(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip66102BitMap.begin,ip66102BitMap.length());
   }
   
     /**
	 * 	Update Ip66102BitMap 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitMap(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip66102BitMap.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip66102BitMap with another Field
	 *	@param value
	 */
   public void setIp66102BitMap(Field source) {
   	replace(source,0,source.length(),ip66102BitMap.begin,ip66102BitMap.length());
   }  
   
     /**
	 * 	Update Ip66102BitMap 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp66102BitMap(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip66102BitMap.begin,ip66102BitMap.length());
   }
   
     /**
	 * 	Update Ip66102BitMap 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66102BitMap(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip66102BitMap.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip66102NormalIpmMsg
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp66102Mti(CONSTANTS.SPACE_4);
          ip66102BitMap.initialize();
     
   }

		public static int getIp66102NormalIpmMsgFieldLength() {
			return IP_66102_NORMAL_IPM_MSG_LENGTH;
		}

}
  
