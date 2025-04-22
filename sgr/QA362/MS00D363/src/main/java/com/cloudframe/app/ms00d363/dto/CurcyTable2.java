package com.cloudframe.app.ms00d363.dto;

/**
*  The class CurcyTable2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CurcyTable2 extends CurcyTable2Serialized { 
   

						private char[] tb2CurId = Field.fillLowValue(3);

						private char[] tb2CurDesc = Field.fillLowValue(30);
	
	/**
	* Constructor for CurcyTable2
	**/
    public CurcyTable2() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CurcyTable2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurcyTable2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of tb2CurId
	 *	@return tb2CurId
	 */
   public char[] getTb2CurId() throws CFException{
     if (isTb2CurIdModified()) { 
        tb2CurId = refreshTb2CurId();
     }
   		return tb2CurId;
   }

  
	/**
	*  set variable tb2CurId
	*  Corresponding COBOL Variable is TB2-CUR-ID
	*  @param value
	**/
   public void setTb2CurId(char[] value) {
      tb2CurId = checkTb2CurIdConstraints(value);
      serializeTb2CurId(tb2CurId);
   } 

     /**
	 * 	Update Tb2CurId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb2CurId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb2CurId,tb2CurId.length);
   	
   }
   
   public void setTb2CurId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb2CurId,tb2CurId.length);
   	
   }
   
     /**
	 * 	Update Tb2CurId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb2CurId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb2CurId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb2CurId with another Field
	 *	@param value
	 */
   public void setTb2CurId(Field source) {
       replace(source,0,source.length(),beginTb2CurId,TB_2_CUR_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Tb2CurId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb2CurId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb2CurId,TB_2_CUR_ID_LEN);
   	
   }
   
     /**
	 * 	Update Tb2CurId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb2CurId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb2CurId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tb2CurDesc
	 *	@return tb2CurDesc
	 */
   public char[] getTb2CurDesc() throws CFException{
     if (isTb2CurDescModified()) { 
        tb2CurDesc = refreshTb2CurDesc();
     }
   		return tb2CurDesc;
   }

  
	/**
	*  set variable tb2CurDesc
	*  Corresponding COBOL Variable is TB2-CUR-DESC
	*  @param value
	**/
   public void setTb2CurDesc(char[] value) {
      tb2CurDesc = checkTb2CurDescConstraints(value);
      serializeTb2CurDesc(tb2CurDesc);
   } 

     /**
	 * 	Update Tb2CurDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTb2CurDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTb2CurDesc,tb2CurDesc.length);
   	
   }
   
   public void setTb2CurDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTb2CurDesc,tb2CurDesc.length);
   	
   }
   
     /**
	 * 	Update Tb2CurDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTb2CurDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb2CurDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tb2CurDesc with another Field
	 *	@param value
	 */
   public void setTb2CurDesc(Field source) {
       replace(source,0,source.length(),beginTb2CurDesc,TB_2_CUR_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Tb2CurDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTb2CurDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTb2CurDesc,TB_2_CUR_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Tb2CurDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTb2CurDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTb2CurDesc+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCurcyTable2FieldLength() {
			return CURCY_TABLE_2_LENGTH;
		}

}
  
