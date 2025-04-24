package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00724Ichg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00724Ichg extends Ip00724IchgSerialized { 
   

						private char[] ip00724IchgRegion = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00724Ichg
	**/
    public Ip00724Ichg() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00724Ichg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00724Ichg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00724IchgRegion
	 *	@return ip00724IchgRegion
	 */
   public char[] getIp00724IchgRegion() throws CFException{
     if (isIp00724IchgRegionModified()) { 
        ip00724IchgRegion = refreshIp00724IchgRegion();
     }
   		return ip00724IchgRegion;
   }

  
	/**
	*  set variable ip00724IchgRegion
	*  Corresponding COBOL Variable is IP00724-ICHG-REGION
	*  @param value
	**/
   public void setIp00724IchgRegion(char[] value) {
      ip00724IchgRegion = checkIp00724IchgRegionConstraints(value);
      serializeIp00724IchgRegion(ip00724IchgRegion);
   } 

     /**
	 * 	Update Ip00724IchgRegion 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724IchgRegion(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724IchgRegion,ip00724IchgRegion.length);
   	
   }
   
   public void setIp00724IchgRegion(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724IchgRegion,ip00724IchgRegion.length);
   	
   }
   
     /**
	 * 	Update Ip00724IchgRegion 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724IchgRegion(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724IchgRegion+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724IchgRegion with another Field
	 *	@param value
	 */
   public void setIp00724IchgRegion(Field source) {
       replace(source,0,source.length(),beginIp00724IchgRegion,IP_00724_ICHG_REGION_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724IchgRegion 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724IchgRegion(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724IchgRegion,IP_00724_ICHG_REGION_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724IchgRegion 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724IchgRegion(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724IchgRegion+targetIndex,targetLen);
    
   }
	char[] ip00724ValidIchgRegion8888Value1 = "A".toCharArray();
char[] ip00724ValidIchgRegion8888Value2 = "B".toCharArray();
char[] ip00724ValidIchgRegion8888Value3 = "C".toCharArray();
char[] ip00724ValidIchgRegion8888Value4 = "D".toCharArray();
char[] ip00724ValidIchgRegion8888Value5 = "E".toCharArray();

	/**
	 *	Test condition "A" "B" "C" "D" "E" for isIp00724ValidIchgRegion88()
	 *	@return  Returns true if isIp00724ValidIchgRegion88() is "A" "B" "C" "D" "E"
	 */
   public boolean isIp00724ValidIchgRegion88() throws CFException {
      return (  compareChars( getIp00724IchgRegion() , ip00724ValidIchgRegion8888Value1)  == 0  ||  compareChars( getIp00724IchgRegion() , ip00724ValidIchgRegion8888Value2)  == 0  ||  compareChars( getIp00724IchgRegion() , ip00724ValidIchgRegion8888Value3)  == 0  ||  compareChars( getIp00724IchgRegion() , ip00724ValidIchgRegion8888Value4)  == 0  ||  compareChars( getIp00724IchgRegion() , ip00724ValidIchgRegion8888Value5)  == 0  );
   }


	/**
	*  set values "A" "B" "C" "D" "E"
	*/
   	public void setIp00724ValidIchgRegion88True() {  			
    	setIp00724IchgRegion( ip00724ValidIchgRegion8888Value1);
   	}

	
	
	
	/**
	 * 	initializes Ip00724Ichg
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00724IchgRegion(CONSTANTS.SPACE);
   }

		public static int getIp00724IchgFieldLength() {
			return IP_00724_ICHG_LENGTH;
		}

}
  
