package com.cloudframe.app.sf311010.dto;

/**
*  The class Sf31IsoCrncyConvFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf31IsoCrncyConvFields extends Sf31IsoCrncyConvFieldsSerialized { 
   

								@Getter @Setter private long sf31IsoDe4TrnAmt;

								@Getter @Setter private long sf31IsoDe5SetlAmt;

								@Getter @Setter private long sf31IsoDe6CrdhldBillAmt;

						@Getter @Setter private char[] sf31IsoDe9SetlCnvRte = new char[8];

						@Getter @Setter private char[] sf31IsoDe10CrdhldCnvRte = new char[8];
				@Getter @Setter private Sf31IsoCnvDteCcyymmdd sf31IsoCnvDteCcyymmdd = new Sf31IsoCnvDteCcyymmdd();

						@Getter @Setter private char[] sf31IsoDe49TrnCurCde = new char[3];

						@Getter @Setter private char[] sf31IsoDe50SetlCurCde = new char[3];

						@Getter @Setter private char[] sf31IsoDe51CrdhldCurCde = new char[3];

						@Getter @Setter private char[] sf31IsoDe48Tag42Fld1 = new char[2];

						@Getter @Setter private char[] sf31IsoDe43MrchNmctst = new char[40];

						@Getter @Setter private char[] sf31IsoDe48Tag84 = new char[2];
	
	/**
	* Constructor for Sf31IsoCrncyConvFields
	**/
    public Sf31IsoCrncyConvFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf31IsoCrncyConvFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf31IsoCrncyConvFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSf31IsoCnvDteCcyymmdd().setParent(this,getStartOffset() + 37);
								setSf31IsoDe4TrnAmt(0L);
								setSf31IsoDe5SetlAmt(0L);
								setSf31IsoDe6CrdhldBillAmt(0L);
								setSf31IsoDe9SetlCnvRte(fillSpace(8));
								setSf31IsoDe10CrdhldCnvRte(fillSpace(8));
								setSf31IsoDe49TrnCurCde(fillSpace(3));
								setSf31IsoDe50SetlCurCde(fillSpace(3));
								setSf31IsoDe51CrdhldCurCde(fillSpace(3));
								setSf31IsoDe48Tag42Fld1(fillSpace(2));
								setSf31IsoDe43MrchNmctst(fillSpace(40));
								setSf31IsoDe48Tag84(fillSpace(2));
    } 



}
  
