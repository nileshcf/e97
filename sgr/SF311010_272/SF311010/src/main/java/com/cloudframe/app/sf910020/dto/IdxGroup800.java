package com.cloudframe.app.sf910020.dto;

/**
*  The class IdxGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/


import com.cloudframe.app.sf910020.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IdxGroup800 extends IdxGroup800Serialized {
   

								private short idx800;
					private Idx800Redefined idx800Redefined = new Idx800Redefined();
	
	/**
	* Constructor for IdxGroup800
	**/
    public IdxGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			idx800Redefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setIdx800((short)0);
    }


 

	/**
	 *	Returns the value of idx800
	 *	@return idx800
	 */
	public short getIdx800() throws CFException {
        if (isIdx800Modified()) { 
           idx800 = refreshIdx800();
        }
   		return idx800;
	}
	
	/**
	 * 	Update Idx800 with the passed value
	 *  Corresponding COBOL Variable is 800-IDX
	 *	@param number
	 */
	public void setIdx800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    idx800 = checkIdx800MaxLimit(number); 
		serializeIdx800(idx800);
	}

	public void setIdx800(int number) {
	    number = checkIdx800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIdx800((short)number);
	}
	public void setIdx800(long number) {
	    number = checkIdx800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIdx800((short)number);
	}
	

	/**
	 *	Returns the value of idx800Redefined
	 *	@return idx800Redefined
	 */   
	 public Idx800Redefined getIdx800Redefined() {
   	return idx800Redefined;
   }
   /**
	* 	Update Idx800Redefined with the passed value
	*   Corresponding COBOL Variable is 800-IDX-REDEFINED
	*	@param value
	*/
   public void setIdx800Redefined(char[] value) {
      idx800Redefined.setString(value); 
   }   
    
     /**
	 * 	Update Idx800Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIdx800Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,idx800Redefined.begin,idx800Redefined.length());
   }
   
     /**
	 * 	Update Idx800Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIdx800Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,idx800Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Idx800Redefined with another Field
	 *	@param value
	 */
   public void setIdx800Redefined(Field source) {
   	replace(source,0,source.length(),idx800Redefined.begin,idx800Redefined.length());
   }  
   
     /**
	 * 	Update Idx800Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIdx800Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,idx800Redefined.begin,idx800Redefined.length());
   }
   
     /**
	 * 	Update Idx800Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIdx800Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,idx800Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIdxGroup800FieldLength() {
			return IDX_GROUP_800_LENGTH;
		}

}
  
