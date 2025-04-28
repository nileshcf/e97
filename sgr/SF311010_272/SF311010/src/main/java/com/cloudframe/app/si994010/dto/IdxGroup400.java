package com.cloudframe.app.si994010.dto;

/**
*  The class IdxGroup400 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.si994010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IdxGroup400 extends IdxGroup400Serialized {
   

								private short idx400;
					private Idx400Redefined idx400Redefined = new Idx400Redefined();
	
	/**
	* Constructor for IdxGroup400
	**/
    public IdxGroup400() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			idx400Redefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setIdx400((short)0);
    }


 

	/**
	 *	Returns the value of idx400
	 *	@return idx400
	 */
	public short getIdx400() throws CFException {
        if (isIdx400Modified()) { 
           idx400 = refreshIdx400();
        }
   		return idx400;
	}
	
	/**
	 * 	Update Idx400 with the passed value
	 *  Corresponding COBOL Variable is 400-IDX
	 *	@param number
	 */
	public void setIdx400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    idx400 = checkIdx400MaxLimit(number); 
		serializeIdx400(idx400);
	}

	public void setIdx400(int number) {
	    number = checkIdx400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIdx400((short)number);
	}
	public void setIdx400(long number) {
	    number = checkIdx400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIdx400((short)number);
	}
	

	/**
	 *	Returns the value of idx400Redefined
	 *	@return idx400Redefined
	 */   
	 public Idx400Redefined getIdx400Redefined() {
   	return idx400Redefined;
   }
   /**
	* 	Update Idx400Redefined with the passed value
	*   Corresponding COBOL Variable is 400-IDX-REDEFINED
	*	@param value
	*/
   public void setIdx400Redefined(char[] value) {
      idx400Redefined.setString(value); 
   }   
    
     /**
	 * 	Update Idx400Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIdx400Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,idx400Redefined.begin,idx400Redefined.length());
   }
   
     /**
	 * 	Update Idx400Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIdx400Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,idx400Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Idx400Redefined with another Field
	 *	@param value
	 */
   public void setIdx400Redefined(Field source) {
   	replace(source,0,source.length(),idx400Redefined.begin,idx400Redefined.length());
   }  
   
     /**
	 * 	Update Idx400Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIdx400Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,idx400Redefined.begin,idx400Redefined.length());
   }
   
     /**
	 * 	Update Idx400Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIdx400Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,idx400Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIdxGroup400FieldLength() {
			return IDX_GROUP_400_LENGTH;
		}

}
  
