package org.optum.uhg.dto.cics0009;

/**
*  The class Ls003RequestDataGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 23:15. using version 5.0.0.158
**/


import org.optum.uhg.dto.serialize.cics0009.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ls003RequestDataGroup extends Ls003RequestDataGroupSerialized { 
   

						private char[] ls003RequestData = Field.fillLowValue(100);
	
	/**
	* Constructor for Ls003RequestDataGroup
	**/
    public Ls003RequestDataGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ls003RequestData
	 *	@return ls003RequestData
	 */
   public char[] getLs003RequestData() throws CFException{
     if (isLs003RequestDataModified()) { 
        ls003RequestData = refreshLs003RequestData();
     }
   		return ls003RequestData;
   }

  
	/**
	*  set variable ls003RequestData
	*  Corresponding COBOL Variable is LS-003-REQUEST-DATA
	*  @param value
	**/
   public void setLs003RequestData(char[] value) {
      ls003RequestData = checkLs003RequestDataConstraints(value);
      serializeLs003RequestData(ls003RequestData);
   } 

     /**
	 * 	Update Ls003RequestData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLs003RequestData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLs003RequestData,ls003RequestData.length);
   	
   }
   
   public void setLs003RequestData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLs003RequestData,ls003RequestData.length);
   	
   }
   
     /**
	 * 	Update Ls003RequestData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLs003RequestData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLs003RequestData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ls003RequestData with another Field
	 *	@param value
	 */
   public void setLs003RequestData(Field source) {
       replace(source,0,source.length(),beginLs003RequestData,LS_003_REQUEST_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Ls003RequestData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLs003RequestData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLs003RequestData,LS_003_REQUEST_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Ls003RequestData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLs003RequestData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLs003RequestData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getLs003RequestDataGroupFieldLength() {
			return LS_003_REQUEST_DATA_GROUP_LENGTH;
		}

}
  
