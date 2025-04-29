package com.cloudframe.app.ip224621.dto;

/**
*  The class AbendParaName900 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:21. using version 5.0.0.254
**/


import com.cloudframe.app.ip224621.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AbendParaName900 extends AbendParaName900Serialized {
   


						private char[] abendPara900 = new char[30];
	
	/**
	* Constructor for AbendParaName900
	**/
    public AbendParaName900() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("PARA NAME : ").toCharArray()
             , getStartOffset() + 0
             ,12
             );
								setAbendPara900(fillSpace(30));
    }


 

	/**
	 *	Returns the value of abendPara900
	 *	@return abendPara900
	 */
   public char[] getAbendPara900() throws CFException{
     if (isAbendPara900Modified()) { 
        abendPara900 = refreshAbendPara900();
     }
   		return abendPara900;
   }

  
	/**
	*  set variable abendPara900
	*  Corresponding COBOL Variable is 900-ABEND-PARA
	*  @param value
	**/
   public void setAbendPara900(char[] value) {
      abendPara900 = checkAbendPara900Constraints(value);
      serializeAbendPara900(abendPara900);
   } 

     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAbendPara900,abendPara900.length);
   	
   }
   
   public void setAbendPara900(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAbendPara900,abendPara900.length);
   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendPara900+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AbendPara900 with another Field
	 *	@param value
	 */
   public void setAbendPara900(Field source) {
       replace(source,0,source.length(),beginAbendPara900,ABEND_PARA_900_LEN);
   	
   }  
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAbendPara900,ABEND_PARA_900_LEN);
   	
   }
   
     /**
	 * 	Update AbendPara900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendPara900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendPara900+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAbendParaName900FieldLength() {
			return ABEND_PARA_NAME_900_LENGTH;
		}

}
  
