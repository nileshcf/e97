package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Sqlda is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.*;


@Data
public class Sqlda extends SqldaSerialized {
   

						@Getter @Setter private char[] sqldaid = Field.fillLowValue(8);

								@Getter @Setter private int sqldabc;

								@Getter @Setter private short sqln;

								@Getter @Setter private short sqld;
			@Getter @Setter private List<Sqlvar> sqlvar = new ArrayList<>();
    	
	
	/**
	* Constructor for Sqlda
	**/
    public Sqlda() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SQLVAR_SIZE;arrayIndex++) {
						getSqlvar().add(new Sqlvar(this, beginSqlvar + 
						arrayIndex * Sqlvar.getSqlvarFieldLength()));
				}
	   	/*  end of offset */
    }





}
  
