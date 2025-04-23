package com.cloudframe.app.ip662010.dto;

/**
*  The class PGroup400 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PGroup400 extends PGroup400Serialized {
   

								private short p400;
					private P400Redefined p400Redefined = new P400Redefined();
	
	/**
	* Constructor for PGroup400
	**/
    public PGroup400() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			p400Redefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setP400((short)0);
    }


 

	/**
	 *	Returns the value of p400
	 *	@return p400
	 */
	public short getP400() throws CFException {
        if (isP400Modified()) { 
           p400 = refreshP400();
        }
   		return p400;
	}
	
	/**
	 * 	Update P400 with the passed value
	 *  Corresponding COBOL Variable is 400-P
	 *	@param number
	 */
	public void setP400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    p400 = checkP400MaxLimit(number); 
		serializeP400(p400);
	}

	public void setP400(int number) {
	    number = checkP400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setP400((short)number);
	}
	public void setP400(long number) {
	    number = checkP400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setP400((short)number);
	}
	

	/**
	 *	Returns the value of p400Redefined
	 *	@return p400Redefined
	 */   
	 public P400Redefined getP400Redefined() {
   	return p400Redefined;
   }
   /**
	* 	Update P400Redefined with the passed value
	*   Corresponding COBOL Variable is 400-P-REDEFINED
	*	@param value
	*/
   public void setP400Redefined(char[] value) {
      p400Redefined.setString(value); 
   }   
    
     /**
	 * 	Update P400Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setP400Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,p400Redefined.begin,p400Redefined.length());
   }
   
     /**
	 * 	Update P400Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setP400Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,p400Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update P400Redefined with another Field
	 *	@param value
	 */
   public void setP400Redefined(Field source) {
   	replace(source,0,source.length(),p400Redefined.begin,p400Redefined.length());
   }  
   
     /**
	 * 	Update P400Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setP400Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,p400Redefined.begin,p400Redefined.length());
   }
   
     /**
	 * 	Update P400Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setP400Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,p400Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getPGroup400FieldLength() {
			return P_GROUP_400_LENGTH;
		}

}
  
