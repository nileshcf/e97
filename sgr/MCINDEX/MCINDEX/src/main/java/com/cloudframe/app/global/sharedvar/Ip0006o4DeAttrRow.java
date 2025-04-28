package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0006o4DeAttrRow is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip0006o4DeAttrRow extends Ip0006o4DeAttrRowSerialized { 
   

								private int ip0006o4DeFirstAb;

						private char[] ip0006o4DeFirstAbRedefined = Field.fillLowValue(4);
				private Ip0006o4DeAttrUserRow ip0006o4DeAttrUserRow = new Ip0006o4DeAttrUserRow();
	
	/**
	* Constructor for Ip0006o4DeAttrRow
	**/
    public Ip0006o4DeAttrRow() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0006o4DeAttrRow. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0006o4DeAttrRow(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip0006o4DeAttrUserRow.setParent(this,getStartOffset() + 4);
    } 

	/**
	 *	Returns the value of ip0006o4DeFirstAb
	 *	@return ip0006o4DeFirstAb
	 */
	public int getIp0006o4DeFirstAb() throws CFException {
        if (isIp0006o4DeFirstAbModified()) { 
           ip0006o4DeFirstAb = refreshIp0006o4DeFirstAb();
        }
   		return ip0006o4DeFirstAb;
	}
	
	/**
	 * 	Update Ip0006o4DeFirstAb with the passed value
	 *  Corresponding COBOL Variable is IP0006O4-DE-FIRST-AB
	 *	@param number
	 */
	public void setIp0006o4DeFirstAb(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip0006o4DeFirstAb = checkIp0006o4DeFirstAbMaxLimit(number); 
		serializeIp0006o4DeFirstAb(ip0006o4DeFirstAb);
	}


	public void setIp0006o4DeFirstAb(long number) {
	    number = checkIp0006o4DeFirstAbMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0006o4DeFirstAb((int)number);
	}
	
	/**
	 *	Returns the value of ip0006o4DeFirstAbRedefined
	 *	@return ip0006o4DeFirstAbRedefined
	 */
   public char[] getIp0006o4DeFirstAbRedefined() throws CFException{
     if (isIp0006o4DeFirstAbRedefinedModified()) { 
        ip0006o4DeFirstAbRedefined = refreshIp0006o4DeFirstAbRedefined();
     }
   		return ip0006o4DeFirstAbRedefined;
   }

  
	/**
	*  set variable ip0006o4DeFirstAbRedefined
	*  Corresponding COBOL Variable is IP0006O4-DE-FIRST-AB-REDEFINED
	*  @param value
	**/
   public void setIp0006o4DeFirstAbRedefined(char[] value) {
      ip0006o4DeFirstAbRedefined = checkIp0006o4DeFirstAbRedefinedConstraints(value);
      serializeIp0006o4DeFirstAbRedefined(ip0006o4DeFirstAbRedefined);
   } 

     /**
	 * 	Update Ip0006o4DeFirstAbRedefined 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0006o4DeFirstAbRedefined(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0006o4DeFirstAbRedefined,ip0006o4DeFirstAbRedefined.length);
   	
   }
   
   public void setIp0006o4DeFirstAbRedefined(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0006o4DeFirstAbRedefined,ip0006o4DeFirstAbRedefined.length);
   	
   }
   
     /**
	 * 	Update Ip0006o4DeFirstAbRedefined 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0006o4DeFirstAbRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0006o4DeFirstAbRedefined+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0006o4DeFirstAbRedefined with another Field
	 *	@param value
	 */
   public void setIp0006o4DeFirstAbRedefined(Field source) {
       replace(source,0,source.length(),beginIp0006o4DeFirstAbRedefined,IP_0006O_4_DE_FIRST_AB_REDEFINED_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0006o4DeFirstAbRedefined 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0006o4DeFirstAbRedefined(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0006o4DeFirstAbRedefined,IP_0006O_4_DE_FIRST_AB_REDEFINED_LEN);
   	
   }
   
     /**
	 * 	Update Ip0006o4DeFirstAbRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0006o4DeFirstAbRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0006o4DeFirstAbRedefined+targetIndex,targetLen);
    
   }
	char[] ip0006o4NoAbValues8888Value = fillHighValue(4);
	/**
	 *	Test condition new byte[] {(byte)0xFF} for isIp0006o4NoAbValues88()
	 *	@return  Returns true if isIp0006o4NoAbValues88() is new byte[] {(byte)0xFF}
	 */
   public boolean isIp0006o4NoAbValues88() throws CFException {
      return (  compareChars( getIp0006o4DeFirstAbRedefined() , ip0006o4NoAbValues8888Value)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0xFF}
	*/
   	public void setIp0006o4NoAbValues88True() {  			
    	setIp0006o4DeFirstAbRedefined( ip0006o4NoAbValues8888Value);
   	}
	/**
	 *	Returns the value of ip0006o4DeAttrUserRow
	 *	@return ip0006o4DeAttrUserRow
	 */   
	 public Ip0006o4DeAttrUserRow getIp0006o4DeAttrUserRow() {
   	return ip0006o4DeAttrUserRow;
   }
   /**
	* 	Update Ip0006o4DeAttrUserRow with the passed value
	*   Corresponding COBOL Variable is IP0006O4-DE-ATTR-USER-ROW
	*	@param value
	*/
   public void setIp0006o4DeAttrUserRow(char[] value) {
      ip0006o4DeAttrUserRow.setString(value); 
   }   
    
     /**
	 * 	Update Ip0006o4DeAttrUserRow 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0006o4DeAttrUserRow(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0006o4DeAttrUserRow.begin,ip0006o4DeAttrUserRow.length());
   }
   
     /**
	 * 	Update Ip0006o4DeAttrUserRow 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0006o4DeAttrUserRow(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0006o4DeAttrUserRow.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0006o4DeAttrUserRow with another Field
	 *	@param value
	 */
   public void setIp0006o4DeAttrUserRow(Field source) {
   	replace(source,0,source.length(),ip0006o4DeAttrUserRow.begin,ip0006o4DeAttrUserRow.length());
   }  
   
     /**
	 * 	Update Ip0006o4DeAttrUserRow 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0006o4DeAttrUserRow(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0006o4DeAttrUserRow.begin,ip0006o4DeAttrUserRow.length());
   }
   
     /**
	 * 	Update Ip0006o4DeAttrUserRow 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0006o4DeAttrUserRow(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0006o4DeAttrUserRow.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip0006o4DeAttrRow
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp0006o4DeFirstAb(0);
          ip0006o4DeAttrUserRow.initialize();
     
   }

		public static int getIp0006o4DeAttrRowFieldLength() {
			return IP_0006O_4_DE_ATTR_ROW_LENGTH;
		}

}
  
