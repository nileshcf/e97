package com.cloudframe.app.ar640010.dto;

/**
*  The class SeqioRdw200 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SeqioRdw200 extends SeqioRdw200Serialized { 
   

								private short seqioLrecl200;

	
	/**
	* Constructor for SeqioRdw200
	**/
    public SeqioRdw200() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SeqioRdw200. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SeqioRdw200(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSeqioLrecl200((short)0);
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 2
             ,2
             );
    } 

	/**
	 *	Returns the value of seqioLrecl200
	 *	@return seqioLrecl200
	 */
	public short getSeqioLrecl200() throws CFException {
        if (isSeqioLrecl200Modified()) { 
           seqioLrecl200 = refreshSeqioLrecl200();
        }
   		return seqioLrecl200;
	}
	
	/**
	 * 	Update SeqioLrecl200 with the passed value
	 *  Corresponding COBOL Variable is 200-SEQIO-LRECL
	 *	@param number
	 */
	public void setSeqioLrecl200(short number) {
	     // Truncate if the number is beyond +/- Max range
	    seqioLrecl200 = checkSeqioLrecl200MaxLimit(number); 
		serializeSeqioLrecl200(seqioLrecl200);
	}

	public void setSeqioLrecl200(int number) {
	    number = checkSeqioLrecl200MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSeqioLrecl200((short)number);
	}
	public void setSeqioLrecl200(long number) {
	    number = checkSeqioLrecl200MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSeqioLrecl200((short)number);
	}
	


	
	
	

		public static int getSeqioRdw200FieldLength() {
			return SEQIO_RDW_200_LENGTH;
		}

}
  
