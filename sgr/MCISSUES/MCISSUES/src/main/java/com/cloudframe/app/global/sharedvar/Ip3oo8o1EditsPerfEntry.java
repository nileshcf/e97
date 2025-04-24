package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip3oo8o1EditsPerfEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


public class Ip3oo8o1EditsPerfEntry extends Ip3oo8o1EditsPerfEntrySerialized { 
   
      private List<char[]> ip3oo8o1EditPerformedInd; 

	
	/**
	* Constructor for Ip3oo8o1EditsPerfEntry
	**/
    public Ip3oo8o1EditsPerfEntry() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip3oo8o1EditsPerfEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip3oo8o1EditsPerfEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

    /**
	 *	Returns the value of ip3oo8o1EditPerformedInd
	 *  Corresponding COBOL Variable is IP3OO8O1-EDIT-PERFORMED-IND
	 *	@return ip3oo8o1EditPerformedInd
	 */
	public List<char[]> getIp3oo8o1EditPerformedInd() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < IP_3OO_8O_1_EDIT_PERFORMED_IND_SIZE;index++) {
        	list.add( getIp3oo8o1EditPerformedInd( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return ip3oo8o1EditPerformedInd
	 */
	public char[] getIp3oo8o1EditPerformedInd(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getIp3oo8o1EditPerformedInd(), resetting it to 0",index);
		    index = 0;
        } else if (index >= IP_3OO_8O_1_EDIT_PERFORMED_IND_SIZE) {
             	index = IP_3OO_8O_1_EDIT_PERFORMED_IND_SIZE -1; // can't exceed max array size
             	logger.trace("ip3oo8o1EditPerformedInd - Array index exceeded max Size {}, resetting it to max allowed",IP_3OO_8O_1_EDIT_PERFORMED_IND_SIZE); 
	    }
   	      return getCharArray( (beginIp3oo8o1EditPerformedInd + index*IP_3OO_8O_1_EDIT_PERFORMED_IND_LEN) , IP_3OO_8O_1_EDIT_PERFORMED_IND_LEN );
    }
    
    
   public int  ip3oo8o1EditPerformedIndFieldLength() {
   	return IP_3OO_8O_1_EDIT_PERFORMED_IND_LEN;
   }
   
	

  
  	/**
	 *	Update Ip3oo8o1EditPerformedInd with the passed value at a given index
	 *  Corresponding COBOL Variable is IP3OO8O1-EDIT-PERFORMED-IND
	 *  @param index
	 *	@param value
	 */
  public void setIp3oo8o1EditPerformedInd(int index,char[] value) {
   	setIp3oo8o1EditPerformedInd(index,value,true);
   }
   
   
   /**
	 *	Update Ip3oo8o1EditPerformedInd with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setIp3oo8o1EditPerformedInd(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setIp3oo8o1EditPerformedInd(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 1)  {     
		       value = substring(value,0,1);
           }  else if (value.length < 1) {
		       value = pad(1, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(1).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeIp3oo8o1EditPerformedInd(index,value);		
       }
   }
   
	 char[] ip3oo8o1EditPerformed8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp3oo8o1EditPerformed88()
	 *	@return Returns true if isIp3oo8o1EditPerformed88() is "Y"
	 */
   public boolean isIp3oo8o1EditPerformed88(int index) throws CFException  {
      return (  compareChars( getIp3oo8o1EditPerformedInd(index) , ip3oo8o1EditPerformed8888Value)  == 0  );
   }
	/**
	*  set values "Y"
	*  @param index
	*/
   	public void setIp3oo8o1EditPerformed88True(int index) {
    	setIp3oo8o1EditPerformedInd(index , "ip3oo8o1EditPerformed8888Value".toCharArray()); 
   	}
	 char[] ip3oo8o1EditNotPerformed8888Value = " ".toCharArray();
	/**
	 *	Test condition " " for isIp3oo8o1EditNotPerformed88()
	 *	@return Returns true if isIp3oo8o1EditNotPerformed88() is " "
	 */
   public boolean isIp3oo8o1EditNotPerformed88(int index) throws CFException  {
      return (  compareChars( getIp3oo8o1EditPerformedInd(index) , ip3oo8o1EditNotPerformed8888Value)  == 0  );
   }
	/**
	*  set values " "
	*  @param index
	*/
   	public void setIp3oo8o1EditNotPerformed88True(int index) {
    	setIp3oo8o1EditPerformedInd(index , "ip3oo8o1EditNotPerformed8888Value".toCharArray()); 
   	}

	
	
	
	/**
	 * 	initializes Ip3oo8o1EditsPerfEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < IP_3OO_8O_1_EDIT_PERFORMED_IND_SIZE;index++) {
             setIp3oo8o1EditPerformedInd(index, CONSTANTS.SPACE);
         }
   }

		public static int getIp3oo8o1EditsPerfEntryFieldLength() {
			return IP_3OO_8O_1_EDITS_PERF_ENTRY_LENGTH;
		}

}
  
