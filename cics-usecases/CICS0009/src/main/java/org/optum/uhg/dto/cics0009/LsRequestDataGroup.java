package org.optum.uhg.dto.cics0009;

/**
*  The class LsRequestDataGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 23:15. using version 5.0.0.158
**/


import org.optum.uhg.dto.serialize.cics0009.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LsRequestDataGroup extends LsRequestDataGroupSerialized { 
   

						private char[] lsRequestData = Field.fillLowValue(100);
	
	/**
	* Constructor for LsRequestDataGroup
	**/
    public LsRequestDataGroup() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for LsRequestDataGroup. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LsRequestDataGroup(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of lsRequestData
	 *	@return lsRequestData
	 */
   public char[] getLsRequestData() throws CFException{
     if (isLsRequestDataModified()) { 
        lsRequestData = refreshLsRequestData();
     }
   		return lsRequestData;
   }

  
	/**
	*  set variable lsRequestData
	*  Corresponding COBOL Variable is LS-REQUEST-DATA
	*  @param value
	**/
   public void setLsRequestData(char[] value) {
      lsRequestData = checkLsRequestDataConstraints(value);
      serializeLsRequestData(lsRequestData);
   } 

     /**
	 * 	Update LsRequestData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLsRequestData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLsRequestData,lsRequestData.length);
   	
   }
   
   public void setLsRequestData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLsRequestData,lsRequestData.length);
   	
   }
   
     /**
	 * 	Update LsRequestData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsRequestData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LsRequestData with another Field
	 *	@param value
	 */
   public void setLsRequestData(Field source) {
       replace(source,0,source.length(),beginLsRequestData,LS_REQUEST_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update LsRequestData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLsRequestData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLsRequestData,LS_REQUEST_DATA_LEN);
   	
   }
   
     /**
	 * 	Update LsRequestData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLsRequestData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLsRequestData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getLsRequestDataGroupFieldLength() {
			return LS_REQUEST_DATA_GROUP_LENGTH;
		}

}
  
