package com.cloudframe.app.dispif.dto;

/**
*  The class IntGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:13. using version 5.0.0.257
**/


import com.cloudframe.app.dispif.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IntGroup extends IntGroupSerialized {
   

								private long intWs;
					private IntX intX = new IntX();
	
	/**
	* Constructor for IntGroup
	**/
    public IntGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			intX.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of intWs
	 *	@return intWs
	 */
	public long getIntWs() throws CFException {
       if (isIntWsModified()) { 
           intWs = refreshIntWs();
        }
   		return intWs;
	}
	

	
	   
	/**
	 * 	Update IntWs with the passed value
	 *  Corresponding COBOL Variable is WS-INT
	 *	@param number
	 */
	public void setIntWs(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    intWs = checkIntWsMaxLimit(number); 
		serializeIntWs(intWs);
	}
	

	/**
	 * 	Update IntWs with the passed value
	 *	@param value (String or char[])
	 */
	public void setIntWs(char[] value) throws CFException {
		 intWs = serializeIntWs(value);
	}
	/**
	 * 	Update IntWs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIntWsString(char[] value) throws CFException {
		 setIntWs(value);
	}
	/**
	 *	Returns the value of intX
	 *	@return intX
	 */   
	 public IntX getIntX() {
   	return intX;
   }
   /**
	* 	Update IntX with the passed value
	*   Corresponding COBOL Variable is WS-INT-X
	*	@param value
	*/
   public void setIntX(char[] value) {
      intX.setString(value); 
   }   
    
     /**
	 * 	Update IntX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIntX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,intX.begin,intX.length());
   }
   
     /**
	 * 	Update IntX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIntX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,intX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IntX with another Field
	 *	@param value
	 */
   public void setIntX(Field source) {
   	replace(source,0,source.length(),intX.begin,intX.length());
   }  
   
     /**
	 * 	Update IntX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIntX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,intX.begin,intX.length());
   }
   
     /**
	 * 	Update IntX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIntX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,intX.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIntGroupFieldLength() {
			return INT_GROUP_LENGTH;
		}

}
  
