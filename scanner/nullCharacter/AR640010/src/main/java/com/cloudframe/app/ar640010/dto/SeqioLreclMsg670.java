package com.cloudframe.app.ar640010.dto;

/**
*  The class SeqioLreclMsg670 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class SeqioLreclMsg670 extends SeqioLreclMsg670Serialized {
   


								private long seqioLreclValue670;
	
	/**
	* Constructor for SeqioLreclMsg670
	**/
    public SeqioLreclMsg670() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("7002-MCISEQIO-LRECL       : ").toCharArray()
             , getStartOffset() + 0
             ,28
             );
								setSeqioLreclValue670(0L);
    }


 

	/**
	 *	Returns the value of seqioLreclValue670
	 *	@return seqioLreclValue670
	 */
	public long getSeqioLreclValue670() throws CFException {
       if (isSeqioLreclValue670Modified()) { 
           seqioLreclValue670 = refreshSeqioLreclValue670();
        }
   		return seqioLreclValue670;
	}
	

	
	   
	/**
	 * 	Update SeqioLreclValue670 with the passed value
	 *  Corresponding COBOL Variable is 670-SEQIO-LRECL-VALUE
	 *	@param number
	 */
	public void setSeqioLreclValue670(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    seqioLreclValue670 = checkSeqioLreclValue670MaxLimit(number); 
		serializeSeqioLreclValue670(seqioLreclValue670);
	}
	

	/**
	 * 	Update SeqioLreclValue670 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSeqioLreclValue670(char[] value) throws CFException {
		 seqioLreclValue670 = serializeSeqioLreclValue670(value);
	}
	/**
	 * 	Update SeqioLreclValue670 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSeqioLreclValue670String(char[] value) throws CFException {
		 setSeqioLreclValue670(value);
	}

	
	
	

		public static int getSeqioLreclMsg670FieldLength() {
			return SEQIO_LRECL_MSG_670_LENGTH;
		}

}
  
