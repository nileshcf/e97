package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip000604DeAttrRow is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip000604DeAttrRow extends Ip000604DeAttrRowSerialized { 
   

								private int ip000604DeFirstAb;

						private char[] ip000604DeFirstAbRedefined = Field.fillLowValue(4);
				private Ip000604DeAttrUserRow ip000604DeAttrUserRow = new Ip000604DeAttrUserRow();
	
	/**
	* Constructor for Ip000604DeAttrRow
	**/
    public Ip000604DeAttrRow() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip000604DeAttrRow. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip000604DeAttrRow(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip000604DeAttrUserRow.setParent(this,getStartOffset() + 4);
    } 

	/**
	 *	Returns the value of ip000604DeFirstAb
	 *	@return ip000604DeFirstAb
	 */
	public int getIp000604DeFirstAb() throws CFException {
        if (isIp000604DeFirstAbModified()) { 
           ip000604DeFirstAb = refreshIp000604DeFirstAb();
        }
   		return ip000604DeFirstAb;
	}
	
	/**
	 * 	Update Ip000604DeFirstAb with the passed value
	 *  Corresponding COBOL Variable is IP000604-DE-FIRST-AB
	 *	@param number
	 */
	public void setIp000604DeFirstAb(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip000604DeFirstAb = checkIp000604DeFirstAbMaxLimit(number); 
		serializeIp000604DeFirstAb(ip000604DeFirstAb);
	}


	public void setIp000604DeFirstAb(long number) {
	    number = checkIp000604DeFirstAbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp000604DeFirstAb((int)number);
	}
	
	/**
	 *	Returns the value of ip000604DeFirstAbRedefined
	 *	@return ip000604DeFirstAbRedefined
	 */
   public char[] getIp000604DeFirstAbRedefined() throws CFException{
     if (isIp000604DeFirstAbRedefinedModified()) { 
        ip000604DeFirstAbRedefined = refreshIp000604DeFirstAbRedefined();
     }
   		return ip000604DeFirstAbRedefined;
   }

  
	/**
	*  set variable ip000604DeFirstAbRedefined
	*  Corresponding COBOL Variable is IP000604-DE-FIRST-AB-REDEFINED
	*  @param value
	**/
   public void setIp000604DeFirstAbRedefined(char[] value) {
      ip000604DeFirstAbRedefined = checkIp000604DeFirstAbRedefinedConstraints(value);
      serializeIp000604DeFirstAbRedefined(ip000604DeFirstAbRedefined);
   } 

     /**
	 * 	Update Ip000604DeFirstAbRedefined 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp000604DeFirstAbRedefined(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp000604DeFirstAbRedefined,ip000604DeFirstAbRedefined.length);
   	
   }
   
   public void setIp000604DeFirstAbRedefined(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp000604DeFirstAbRedefined,ip000604DeFirstAbRedefined.length);
   	
   }
   
     /**
	 * 	Update Ip000604DeFirstAbRedefined 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000604DeFirstAbRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000604DeFirstAbRedefined+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip000604DeFirstAbRedefined with another Field
	 *	@param value
	 */
   public void setIp000604DeFirstAbRedefined(Field source) {
       replace(source,0,source.length(),beginIp000604DeFirstAbRedefined,IP_000604_DE_FIRST_AB_REDEFINED_LEN);
   	
   }  
   
     /**
	 * 	Update Ip000604DeFirstAbRedefined 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp000604DeFirstAbRedefined(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp000604DeFirstAbRedefined,IP_000604_DE_FIRST_AB_REDEFINED_LEN);
   	
   }
   
     /**
	 * 	Update Ip000604DeFirstAbRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000604DeFirstAbRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp000604DeFirstAbRedefined+targetIndex,targetLen);
    
   }
	char[] ip000604NoAbValues8888Value = fillHighValue(4);
	/**
	 *	Test condition new byte[] {(byte)0xFF} for isIp000604NoAbValues88()
	 *	@return  Returns true if isIp000604NoAbValues88() is new byte[] {(byte)0xFF}
	 */
   public boolean isIp000604NoAbValues88() throws CFException {
      return (  compareChars( getIp000604DeFirstAbRedefined() , ip000604NoAbValues8888Value)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setIp000604NoAbValues88True() {  			
    	setIp000604DeFirstAbRedefined( ip000604NoAbValues8888Value);
   	}
	/**
	 *	Returns the value of ip000604DeAttrUserRow
	 *	@return ip000604DeAttrUserRow
	 */   
	 public Ip000604DeAttrUserRow getIp000604DeAttrUserRow() {
   	return ip000604DeAttrUserRow;
   }
   /**
	* 	Update Ip000604DeAttrUserRow with the passed value
	*   Corresponding COBOL Variable is IP000604-DE-ATTR-USER-ROW
	*	@param value
	*/
   public void setIp000604DeAttrUserRow(char[] value) {
      ip000604DeAttrUserRow.setString(value); 
   }   
    
     /**
	 * 	Update Ip000604DeAttrUserRow 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp000604DeAttrUserRow(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip000604DeAttrUserRow.begin,ip000604DeAttrUserRow.length());
   }
   
     /**
	 * 	Update Ip000604DeAttrUserRow 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp000604DeAttrUserRow(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip000604DeAttrUserRow.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip000604DeAttrUserRow with another Field
	 *	@param value
	 */
   public void setIp000604DeAttrUserRow(Field source) {
   	replace(source,0,source.length(),ip000604DeAttrUserRow.begin,ip000604DeAttrUserRow.length());
   }  
   
     /**
	 * 	Update Ip000604DeAttrUserRow 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp000604DeAttrUserRow(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip000604DeAttrUserRow.begin,ip000604DeAttrUserRow.length());
   }
   
     /**
	 * 	Update Ip000604DeAttrUserRow 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp000604DeAttrUserRow(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip000604DeAttrUserRow.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip000604DeAttrRow
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp000604DeFirstAb(0);
          ip000604DeAttrUserRow.initialize();
     
   }

		public static int getIp000604DeAttrRowFieldLength() {
			return IP_000604_DE_ATTR_ROW_LENGTH;
		}

}
  
