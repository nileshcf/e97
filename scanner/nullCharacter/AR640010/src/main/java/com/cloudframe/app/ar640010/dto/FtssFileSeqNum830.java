package com.cloudframe.app.ar640010.dto;

/**
*  The class FtssFileSeqNum830 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FtssFileSeqNum830 extends FtssFileSeqNum830Serialized { 
   

								private int ftssFileCyclNum830;
	
	/**
	* Constructor for FtssFileSeqNum830
	**/
    public FtssFileSeqNum830() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FtssFileSeqNum830. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FtssFileSeqNum830(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ftssFileCyclNum830
	 *	@return ftssFileCyclNum830
	 */
	public int getFtssFileCyclNum830() throws CFException {
       if (isFtssFileCyclNum830Modified()) { 
           ftssFileCyclNum830 = refreshFtssFileCyclNum830();
        }
   		return ftssFileCyclNum830;
	}
	

	
	   
	/**
	 * 	Update FtssFileCyclNum830 with the passed value
	 *  Corresponding COBOL Variable is 830-FTSS-FILE-CYCL-NUM
	 *	@param number
	 */
	public void setFtssFileCyclNum830(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ftssFileCyclNum830 = checkFtssFileCyclNum830MaxLimit(number); 
		serializeFtssFileCyclNum830(ftssFileCyclNum830);
	}
	

	public void setFtssFileCyclNum830(long number) {
	    number = checkFtssFileCyclNum830MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFtssFileCyclNum830((int)number);
	}
	
	/**
	 * 	Update FtssFileCyclNum830 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFtssFileCyclNum830(char[] value) throws CFException {
		 ftssFileCyclNum830 = serializeFtssFileCyclNum830(value);
	}
	/**
	 * 	Update FtssFileCyclNum830 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFtssFileCyclNum830String(char[] value) throws CFException {
		 setFtssFileCyclNum830(value);
	}

	
	
	

		public static int getFtssFileSeqNum830FieldLength() {
			return FTSS_FILE_SEQ_NUM_830_LENGTH;
		}

}
  
