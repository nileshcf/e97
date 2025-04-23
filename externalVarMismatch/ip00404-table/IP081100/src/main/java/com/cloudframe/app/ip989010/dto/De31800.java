package com.cloudframe.app.ip989010.dto;

/**
*  The class De31800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class De31800 extends De31800Serialized { 
   
				private De31S1S2S3S4800 de31S1S2S3S4800 = new De31S1S2S3S4800();

								private int de31S5800;
	
	/**
	* Constructor for De31800
	**/
    public De31800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for De31800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public De31800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			de31S1S2S3S4800.setParent(this,getStartOffset() + 0);
								setDe31S5800(0);
    } 

	/**
	 *	Returns the value of de31S1S2S3S4800
	 *	@return de31S1S2S3S4800
	 */   
	 public De31S1S2S3S4800 getDe31S1S2S3S4800() {
   	return de31S1S2S3S4800;
   }
   /**
	* 	Update De31S1S2S3S4800 with the passed value
	*   Corresponding COBOL Variable is 800-DE31-S1-S2-S3-S4
	*	@param value
	*/
   public void setDe31S1S2S3S4800(char[] value) {
      de31S1S2S3S4800.setString(value); 
   }   
    
     /**
	 * 	Update De31S1S2S3S4800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDe31S1S2S3S4800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,de31S1S2S3S4800.begin,de31S1S2S3S4800.length());
   }
   
     /**
	 * 	Update De31S1S2S3S4800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDe31S1S2S3S4800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,de31S1S2S3S4800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update De31S1S2S3S4800 with another Field
	 *	@param value
	 */
   public void setDe31S1S2S3S4800(Field source) {
   	replace(source,0,source.length(),de31S1S2S3S4800.begin,de31S1S2S3S4800.length());
   }  
   
     /**
	 * 	Update De31S1S2S3S4800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDe31S1S2S3S4800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,de31S1S2S3S4800.begin,de31S1S2S3S4800.length());
   }
   
     /**
	 * 	Update De31S1S2S3S4800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDe31S1S2S3S4800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,de31S1S2S3S4800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of de31S5800
	 *	@return de31S5800
	 */
	public int getDe31S5800() throws CFException {
       if (isDe31S5800Modified()) { 
           de31S5800 = refreshDe31S5800();
        }
   		return de31S5800;
	}
	

	
	   
	/**
	 * 	Update De31S5800 with the passed value
	 *  Corresponding COBOL Variable is 800-DE31-S5
	 *	@param number
	 */
	public void setDe31S5800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    de31S5800 = checkDe31S5800MaxLimit(number); 
		serializeDe31S5800(de31S5800);
	}
	

	public void setDe31S5800(long number) {
	    number = checkDe31S5800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDe31S5800((int)number);
	}
	
	/**
	 * 	Update De31S5800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDe31S5800(char[] value) throws CFException {
		 de31S5800 = serializeDe31S5800(value);
	}
	/**
	 * 	Update De31S5800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDe31S5800String(char[] value) throws CFException {
		 setDe31S5800(value);
	}

	
	
	

		public static int getDe31800FieldLength() {
			return DE_31800_LENGTH;
		}

}
  
