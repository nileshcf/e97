package com.cloudframe.app.ip829010.dto;

/**
*  The class AbendPara900 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/


import com.cloudframe.app.ip829010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AbendPara900 extends AbendPara900Serialized {
   


						private char[] abendParaName900 = new char[30];
	
	/**
	* Constructor for AbendPara900
	**/
    public AbendPara900() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("PARA NAME : ").toCharArray()
             , getStartOffset() + 0
             ,12
             );
								setAbendParaName900(fillSpace(30));
    }


 

	/**
	 *	Returns the value of abendParaName900
	 *	@return abendParaName900
	 */
   public char[] getAbendParaName900() throws CFException{
     if (isAbendParaName900Modified()) { 
        abendParaName900 = refreshAbendParaName900();
     }
   		return abendParaName900;
   }

  
	/**
	*  set variable abendParaName900
	*  Corresponding COBOL Variable is 900-ABEND-PARA-NAME
	*  @param value
	**/
   public void setAbendParaName900(char[] value) {
      abendParaName900 = checkAbendParaName900Constraints(value);
      serializeAbendParaName900(abendParaName900);
   } 

     /**
	 * 	Update AbendParaName900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendParaName900(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAbendParaName900,abendParaName900.length);
   	
   }
   
   public void setAbendParaName900(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAbendParaName900,abendParaName900.length);
   	
   }
   
     /**
	 * 	Update AbendParaName900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendParaName900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendParaName900+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AbendParaName900 with another Field
	 *	@param value
	 */
   public void setAbendParaName900(Field source) {
       replace(source,0,source.length(),beginAbendParaName900,ABEND_PARA_NAME_900_LEN);
   	
   }  
   
     /**
	 * 	Update AbendParaName900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendParaName900(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAbendParaName900,ABEND_PARA_NAME_900_LEN);
   	
   }
   
     /**
	 * 	Update AbendParaName900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendParaName900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendParaName900+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAbendPara900FieldLength() {
			return ABEND_PARA_900_LENGTH;
		}

}
  
