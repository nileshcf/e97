package com.cloudframe.app.ar640010.dto;

/**
*  The class ListRecord220 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ListRecord220 extends ListRecord220Serialized {
   

						private char[] listEndptId220 = new char[7];
	
	/**
	* Constructor for ListRecord220
	**/
    public ListRecord220() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setListEndptId220(fillSpace(7));
    }


 

	/**
	 *	Returns the value of listEndptId220
	 *	@return listEndptId220
	 */
   public char[] getListEndptId220() throws CFException{
     if (isListEndptId220Modified()) { 
        listEndptId220 = refreshListEndptId220();
     }
   		return listEndptId220;
   }

  
	/**
	*  set variable listEndptId220
	*  Corresponding COBOL Variable is 220-LIST-ENDPT-ID
	*  @param value
	**/
   public void setListEndptId220(char[] value) {
      listEndptId220 = checkListEndptId220Constraints(value);
      serializeListEndptId220(listEndptId220);
   } 

     /**
	 * 	Update ListEndptId220 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setListEndptId220(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginListEndptId220,listEndptId220.length);
   	
   }
   
   public void setListEndptId220(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginListEndptId220,listEndptId220.length);
   	
   }
   
     /**
	 * 	Update ListEndptId220 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setListEndptId220(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginListEndptId220+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ListEndptId220 with another Field
	 *	@param value
	 */
   public void setListEndptId220(Field source) {
       replace(source,0,source.length(),beginListEndptId220,LIST_ENDPT_ID_220_LEN);
   	
   }  
   
     /**
	 * 	Update ListEndptId220 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setListEndptId220(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginListEndptId220,LIST_ENDPT_ID_220_LEN);
   	
   }
   
     /**
	 * 	Update ListEndptId220 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setListEndptId220(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginListEndptId220+targetIndex,targetLen);
    
   }

	
	
	

		public static int getListRecord220FieldLength() {
			return LIST_RECORD_220_LENGTH;
		}

}
  
