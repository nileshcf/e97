package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Sqlvar1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sqlvar1 extends Sqlvar1Serialized { 
   

								@Getter @Setter private short sqltype;

								@Getter @Setter private short sqllen;
				@Getter @Setter private SqllenRedefined sqllenRedefined = new SqllenRedefined();

								@Getter @Setter private int sqldata;

								@Getter @Setter private int sqlind;
				@Getter @Setter private Sqlname sqlname = new Sqlname();
	
	/**
	* Constructor for Sqlvar1
	**/
    public Sqlvar1() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sqlvar1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sqlvar1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSqllenRedefined().setParent(this,getStartOffset() + 2);
					getSqlname().setParent(this,getStartOffset() + 12);
    } 



}
  
