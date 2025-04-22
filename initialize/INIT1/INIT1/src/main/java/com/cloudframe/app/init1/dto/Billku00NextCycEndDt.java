package com.cloudframe.app.init1.dto;

/**
*  The class Billku00NextCycEndDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Billku00NextCycEndDt extends Billku00NextCycEndDtSerialized { 
   

								private int billku00NextCycEndDtMm;


								private int billku00NextCycEndDtDd;


								private int billku00NextCycEndDtYyyy;

								private int billku00Number;

								private int billku00Pointer;

								private int billku00Number1;

	
	/**
	* Constructor for Billku00NextCycEndDt
	**/
    public Billku00NextCycEndDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Billku00NextCycEndDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Billku00NextCycEndDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of billku00NextCycEndDtMm
	 *	@return billku00NextCycEndDtMm
	 */
	public int getBillku00NextCycEndDtMm() throws CFException {
       if (isBillku00NextCycEndDtMmModified()) { 
           billku00NextCycEndDtMm = refreshBillku00NextCycEndDtMm();
        }
   		return billku00NextCycEndDtMm;
	}
	

	
	   
	/**
	 * 	Update Billku00NextCycEndDtMm with the passed value
	 *  Corresponding COBOL Variable is BILLKU00-NEXT-CYC-END-DT-MM
	 *	@param number
	 */
	public void setBillku00NextCycEndDtMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    billku00NextCycEndDtMm = checkBillku00NextCycEndDtMmMaxLimit(number); 
		serializeBillku00NextCycEndDtMm(billku00NextCycEndDtMm);
	}
	

	public void setBillku00NextCycEndDtMm(long number) {
	    number = checkBillku00NextCycEndDtMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBillku00NextCycEndDtMm((int)number);
	}
	
	/**
	 * 	Update Billku00NextCycEndDtMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setBillku00NextCycEndDtMm(char[] value) throws CFException {
		 billku00NextCycEndDtMm = serializeBillku00NextCycEndDtMm(value);
	}
	/**
	 * 	Update Billku00NextCycEndDtMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBillku00NextCycEndDtMmString(char[] value) throws CFException {
		 setBillku00NextCycEndDtMm(value);
	}
	/**
	 *	Returns the value of billku00NextCycEndDtDd
	 *	@return billku00NextCycEndDtDd
	 */
	public int getBillku00NextCycEndDtDd() throws CFException {
       if (isBillku00NextCycEndDtDdModified()) { 
           billku00NextCycEndDtDd = refreshBillku00NextCycEndDtDd();
        }
   		return billku00NextCycEndDtDd;
	}
	

	
	   
	/**
	 * 	Update Billku00NextCycEndDtDd with the passed value
	 *  Corresponding COBOL Variable is BILLKU00-NEXT-CYC-END-DT-DD
	 *	@param number
	 */
	public void setBillku00NextCycEndDtDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    billku00NextCycEndDtDd = checkBillku00NextCycEndDtDdMaxLimit(number); 
		serializeBillku00NextCycEndDtDd(billku00NextCycEndDtDd);
	}
	

	public void setBillku00NextCycEndDtDd(long number) {
	    number = checkBillku00NextCycEndDtDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBillku00NextCycEndDtDd((int)number);
	}
	
	/**
	 * 	Update Billku00NextCycEndDtDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBillku00NextCycEndDtDd(char[] value) throws CFException {
		 billku00NextCycEndDtDd = serializeBillku00NextCycEndDtDd(value);
	}
	/**
	 * 	Update Billku00NextCycEndDtDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBillku00NextCycEndDtDdString(char[] value) throws CFException {
		 setBillku00NextCycEndDtDd(value);
	}
	/**
	 *	Returns the value of billku00NextCycEndDtYyyy
	 *	@return billku00NextCycEndDtYyyy
	 */
	public int getBillku00NextCycEndDtYyyy() throws CFException {
       if (isBillku00NextCycEndDtYyyyModified()) { 
           billku00NextCycEndDtYyyy = refreshBillku00NextCycEndDtYyyy();
        }
   		return billku00NextCycEndDtYyyy;
	}
	

	
	   
	/**
	 * 	Update Billku00NextCycEndDtYyyy with the passed value
	 *  Corresponding COBOL Variable is BILLKU00-NEXT-CYC-END-DT-YYYY
	 *	@param number
	 */
	public void setBillku00NextCycEndDtYyyy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    billku00NextCycEndDtYyyy = checkBillku00NextCycEndDtYyyyMaxLimit(number); 
		serializeBillku00NextCycEndDtYyyy(billku00NextCycEndDtYyyy);
	}
	

	public void setBillku00NextCycEndDtYyyy(long number) {
	    number = checkBillku00NextCycEndDtYyyyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBillku00NextCycEndDtYyyy((int)number);
	}
	
	/**
	 * 	Update Billku00NextCycEndDtYyyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setBillku00NextCycEndDtYyyy(char[] value) throws CFException {
		 billku00NextCycEndDtYyyy = serializeBillku00NextCycEndDtYyyy(value);
	}
	/**
	 * 	Update Billku00NextCycEndDtYyyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBillku00NextCycEndDtYyyyString(char[] value) throws CFException {
		 setBillku00NextCycEndDtYyyy(value);
	}
	/**
	 *	Returns the value of billku00Number
	 *	@return billku00Number
	 */
	public int getBillku00Number() throws CFException {
       if (isBillku00NumberModified()) { 
           billku00Number = refreshBillku00Number();
        }
   		return billku00Number;
	}
	

	
	   
	/**
	 * 	Update Billku00Number with the passed value
	 *  Corresponding COBOL Variable is BILLKU00-NUMBER
	 *	@param number
	 */
	public void setBillku00Number(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    billku00Number = checkBillku00NumberMaxLimit(number); 
		serializeBillku00Number(billku00Number);
	}
	

	public void setBillku00Number(long number) {
	    number = checkBillku00NumberMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBillku00Number((int)number);
	}
	
	/**
	 * 	Update Billku00Number with the passed value
	 *	@param value (String or char[])
	 */
	public void setBillku00Number(char[] value) throws CFException {
		 billku00Number = serializeBillku00Number(value);
	}
	/**
	 * 	Update Billku00Number with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBillku00NumberString(char[] value) throws CFException {
		 setBillku00Number(value);
	}
	/**
	 *	Returns the value of billku00Pointer
	 *	@return billku00Pointer
	 */
	public int getBillku00Pointer() throws CFException {
        if (isBillku00PointerModified()) { 
           billku00Pointer = refreshBillku00Pointer();
        }
   		return billku00Pointer;
	}
	
	/**
	 * 	Update Billku00Pointer with the passed value
	 *  Corresponding COBOL Variable is BILLKU00-POINTER
	 *	@param number
	 */
	public void setBillku00Pointer(int number) {
	     // Truncate if the number is beyond +/- Max range
	    billku00Pointer = checkBillku00PointerMaxLimit(number); 
		serializeBillku00Pointer(billku00Pointer);
	}


	public void setBillku00Pointer(long number) {
	    number = checkBillku00PointerMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBillku00Pointer((int)number);
	}
	
	/**
	 *	Returns the value of billku00Number1
	 *	@return billku00Number1
	 */
	public int getBillku00Number1() throws CFException {
       if (isBillku00Number1Modified()) { 
           billku00Number1 = refreshBillku00Number1();
        }
   		return billku00Number1;
	}
	

	
	   
	/**
	 * 	Update Billku00Number1 with the passed value
	 *  Corresponding COBOL Variable is BILLKU00-NUMBER1
	 *	@param number
	 */
	public void setBillku00Number1(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    billku00Number1 = checkBillku00Number1MaxLimit(number); 
		serializeBillku00Number1(billku00Number1);
	}
	

	public void setBillku00Number1(long number) {
	    number = checkBillku00Number1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBillku00Number1((int)number);
	}
	
	/**
	 * 	Update Billku00Number1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBillku00Number1(char[] value) throws CFException {
		 billku00Number1 = serializeBillku00Number1(value);
	}
	/**
	 * 	Update Billku00Number1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBillku00Number1String(char[] value) throws CFException {
		 setBillku00Number1(value);
	}

	
	
	
	/**
	 * 	initializes Billku00NextCycEndDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBillku00NextCycEndDtMm(0);
                     setBillku00NextCycEndDtDd(0);
                     setBillku00NextCycEndDtYyyy(0);
                     setBillku00Number(0);
                     setBillku00Number1(0);
   }

		public static int getBillku00NextCycEndDtFieldLength() {
			return BILLKU_00_NEXT_CYC_END_DT_LENGTH;
		}

}
  
