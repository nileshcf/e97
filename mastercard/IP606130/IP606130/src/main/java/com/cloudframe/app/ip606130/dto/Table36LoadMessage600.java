package com.cloudframe.app.ip606130.dto;

/**
*  The class Table36LoadMessage600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class Table36LoadMessage600 extends Table36LoadMessage600Serialized {
   


								private char[] table36BslSub600 = new char[10];
							
	
	/**
	* Constructor for Table36LoadMessage600
	**/
    public Table36LoadMessage600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("NUMBER OF TABLE36 RECORDS LOADED           :").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setTable36BslSub600(CFUtil.cobolNumberFormatter("ZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
    }


 

	/**
	 *	Returns the value of table36BslSub600
	 *	@return table36BslSub600
	 */
   public char[] getTable36BslSub600() throws CFException{
     if (isTable36BslSub600Modified()) { 
        table36BslSub600 = refreshTable36BslSub600();
     }
   		return table36BslSub600;
   }

  
	/**
	*  set variable table36BslSub600
	*  Corresponding COBOL Variable is 600-TABLE36-BSL-SUB
	*  @param value
	**/
   public void setTable36BslSub600(char[] value) {
      table36BslSub600 = checkTable36BslSub600Constraints(value);
      serializeTable36BslSub600(table36BslSub600);
   } 

     /**
	 * 	Update Table36BslSub600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTable36BslSub600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTable36BslSub600,table36BslSub600.length);
   	
   }
   
   public void setTable36BslSub600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTable36BslSub600,table36BslSub600.length);
   	
   }
   
     /**
	 * 	Update Table36BslSub600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTable36BslSub600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTable36BslSub600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Table36BslSub600 with another Field
	 *	@param value
	 */
   public void setTable36BslSub600(Field source) {
       replace(source,0,source.length(),beginTable36BslSub600,TABLE_36_BSL_SUB_600_LEN);
   	
   }  
   
     /**
	 * 	Update Table36BslSub600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTable36BslSub600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTable36BslSub600,TABLE_36_BSL_SUB_600_LEN);
   	
   }
   
     /**
	 * 	Update Table36BslSub600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTable36BslSub600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTable36BslSub600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTable36LoadMessage600FieldLength() {
			return TABLE_36_LOAD_MESSAGE_600_LENGTH;
		}

}
  
