package com.cloudframe.app.dispif.dto;

/**
*  The class ShortGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.dispif.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ShortGroup extends ShortGroupSerialized { 
   

								private int shortWs;
					private ShortX shortX = new ShortX();
	
	/**
	* Constructor for ShortGroup
	**/
    public ShortGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			shortX.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of shortWs
	 *	@return shortWs
	 */
	public int getShortWs() throws CFException {
       if (isShortWsModified()) { 
           shortWs = refreshShortWs();
        }
   		return shortWs;
	}
	

	
	   
	/**
	 * 	Update ShortWs with the passed value
	 *  Corresponding COBOL Variable is WS-SHORT
	 *	@param number
	 */
	public void setShortWs(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    shortWs = checkShortWsMaxLimit(number); 
		serializeShortWs(shortWs);
	}
	

	public void setShortWs(long number) {
	    number = checkShortWsMaxLimit(number); // Truncate if value is beyond +/- Max range
		setShortWs((int)number);
	}
	
	/**
	 * 	Update ShortWs with the passed value
	 *	@param value (String or char[])
	 */
	public void setShortWs(char[] value) throws CFException {
		 shortWs = serializeShortWs(value);
	}
	/**
	 * 	Update ShortWs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setShortWsString(char[] value) throws CFException {
		 setShortWs(value);
	}
	/**
	 *	Returns the value of shortX
	 *	@return shortX
	 */   
	 public ShortX getShortX() {
   	return shortX;
   }
   /**
	* 	Update ShortX with the passed value
	*   Corresponding COBOL Variable is WS-SHORT-X
	*	@param value
	*/
   public void setShortX(char[] value) {
      shortX.setString(value); 
   }   
    
     /**
	 * 	Update ShortX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setShortX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,shortX.begin,shortX.length());
   }
   
     /**
	 * 	Update ShortX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setShortX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,shortX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ShortX with another Field
	 *	@param value
	 */
   public void setShortX(Field source) {
   	replace(source,0,source.length(),shortX.begin,shortX.length());
   }  
   
     /**
	 * 	Update ShortX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setShortX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,shortX.begin,shortX.length());
   }
   
     /**
	 * 	Update ShortX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setShortX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,shortX.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getShortGroupFieldLength() {
			return SHORT_GROUP_LENGTH;
		}

}
  
