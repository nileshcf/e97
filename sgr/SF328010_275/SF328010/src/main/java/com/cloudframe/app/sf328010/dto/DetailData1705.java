package com.cloudframe.app.sf328010.dto;

/**
*  The class DetailData1705 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:58. using version 5.0.0.256
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DetailData1705 extends DetailData1705Serialized {
   
				private Detail1705 detail1705 = new Detail1705();
	
	/**
	* Constructor for DetailData1705
	**/
    public DetailData1705() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			detail1705.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of detail1705
	 *	@return detail1705
	 */   
	 public Detail1705 getDetail1705() {
   	return detail1705;
   }
   /**
	* 	Update Detail1705 with the passed value
	*   Corresponding COBOL Variable is 705-DETAIL1
	*	@param value
	*/
   public void setDetail1705(char[] value) {
      detail1705.setString(value); 
   }   
    
     /**
	 * 	Update Detail1705 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDetail1705(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,detail1705.begin,detail1705.length());
   }
   
     /**
	 * 	Update Detail1705 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetail1705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,detail1705.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Detail1705 with another Field
	 *	@param value
	 */
   public void setDetail1705(Field source) {
   	replace(source,0,source.length(),detail1705.begin,detail1705.length());
   }  
   
     /**
	 * 	Update Detail1705 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDetail1705(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,detail1705.begin,detail1705.length());
   }
   
     /**
	 * 	Update Detail1705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetail1705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,detail1705.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDetailData1705FieldLength() {
			return DETAIL_DATA_1705_LENGTH;
		}

}
  
