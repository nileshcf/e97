package com.cloudframe.app.sf305120.dto;

/**
*  The class RhInt16Group810 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RhInt16Group810 extends RhInt16Group810Serialized {
   

								private short rhInt16810;
					private RhInt16810Redefined rhInt16810Redefined = new RhInt16810Redefined();
	
	/**
	* Constructor for RhInt16Group810
	**/
    public RhInt16Group810() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			rhInt16810Redefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setRhInt16810((short)0);
    }


 

	/**
	 *	Returns the value of rhInt16810
	 *	@return rhInt16810
	 */
	public short getRhInt16810() throws CFException {
        if (isRhInt16810Modified()) { 
           rhInt16810 = refreshRhInt16810();
        }
   		return rhInt16810;
	}
	
	/**
	 * 	Update RhInt16810 with the passed value
	 *  Corresponding COBOL Variable is 810-RH-INT16
	 *	@param number
	 */
	public void setRhInt16810(short number) {
	     // Truncate if the number is beyond +/- Max range
	    rhInt16810 = checkRhInt16810MaxLimit(number); 
		serializeRhInt16810(rhInt16810);
	}

	public void setRhInt16810(int number) {
	    number = checkRhInt16810MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRhInt16810((short)number);
	}
	public void setRhInt16810(long number) {
	    number = checkRhInt16810MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRhInt16810((short)number);
	}
	

	/**
	 *	Returns the value of rhInt16810Redefined
	 *	@return rhInt16810Redefined
	 */   
	 public RhInt16810Redefined getRhInt16810Redefined() {
   	return rhInt16810Redefined;
   }
   /**
	* 	Update RhInt16810Redefined with the passed value
	*   Corresponding COBOL Variable is 810-RH-INT16-REDEFINED
	*	@param value
	*/
   public void setRhInt16810Redefined(char[] value) {
      rhInt16810Redefined.setString(value); 
   }   
    
     /**
	 * 	Update RhInt16810Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRhInt16810Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rhInt16810Redefined.begin,rhInt16810Redefined.length());
   }
   
     /**
	 * 	Update RhInt16810Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRhInt16810Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rhInt16810Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update RhInt16810Redefined with another Field
	 *	@param value
	 */
   public void setRhInt16810Redefined(Field source) {
   	replace(source,0,source.length(),rhInt16810Redefined.begin,rhInt16810Redefined.length());
   }  
   
     /**
	 * 	Update RhInt16810Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRhInt16810Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rhInt16810Redefined.begin,rhInt16810Redefined.length());
   }
   
     /**
	 * 	Update RhInt16810Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRhInt16810Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rhInt16810Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getRhInt16Group810FieldLength() {
			return RH_INT_16_GROUP_810_LENGTH;
		}

}
  
