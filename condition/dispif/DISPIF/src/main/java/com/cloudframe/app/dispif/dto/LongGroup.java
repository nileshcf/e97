package com.cloudframe.app.dispif.dto;

/**
*  The class LongGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.dispif.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LongGroup extends LongGroupSerialized { 
   

								private long longWs;
					private LongX longX = new LongX();
	
	/**
	* Constructor for LongGroup
	**/
    public LongGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			longX.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of longWs
	 *	@return longWs
	 */
	public long getLongWs() throws CFException {
       if (isLongWsModified()) { 
           longWs = refreshLongWs();
        }
   		return longWs;
	}
	

	
	   
	/**
	 * 	Update LongWs with the passed value
	 *  Corresponding COBOL Variable is WS-LONG
	 *	@param number
	 */
	public void setLongWs(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    longWs = checkLongWsMaxLimit(number); 
		serializeLongWs(longWs);
	}
	

	/**
	 * 	Update LongWs with the passed value
	 *	@param value (String or char[])
	 */
	public void setLongWs(char[] value) throws CFException {
		 longWs = serializeLongWs(value);
	}
	/**
	 * 	Update LongWs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLongWsString(char[] value) throws CFException {
		 setLongWs(value);
	}
	/**
	 *	Returns the value of longX
	 *	@return longX
	 */   
	 public LongX getLongX() {
   	return longX;
   }
   /**
	* 	Update LongX with the passed value
	*   Corresponding COBOL Variable is WS-LONG-X
	*	@param value
	*/
   public void setLongX(char[] value) {
      longX.setString(value); 
   }   
    
     /**
	 * 	Update LongX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setLongX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,longX.begin,longX.length());
   }
   
     /**
	 * 	Update LongX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLongX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,longX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update LongX with another Field
	 *	@param value
	 */
   public void setLongX(Field source) {
   	replace(source,0,source.length(),longX.begin,longX.length());
   }  
   
     /**
	 * 	Update LongX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setLongX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,longX.begin,longX.length());
   }
   
     /**
	 * 	Update LongX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLongX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,longX.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getLongGroupFieldLength() {
			return LONG_GROUP_LENGTH;
		}

}
  
