package com.cloudframe.app.cfdate02.dto;

/**
*  The class Sqlca is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.List;


@Data
public class Sqlca extends SqlcaSerialized {
   

						@Getter @Setter private char[] sqlcaid = Field.fillLowValue(8);

								@Getter @Setter private int sqlcabc;

								@Getter @Setter private int sqlcode;
				@Getter @Setter private Sqlerrm sqlerrm = new Sqlerrm();

						@Getter @Setter private char[] sqlerrp = Field.fillLowValue(8);
      private List<Integer> sqlerrd; 

				@Getter @Setter private Sqlwarn sqlwarn = new Sqlwarn();
				@Getter @Setter private Sqlext sqlext = new Sqlext();
	
	/**
	* Constructor for Sqlca
	**/
    public Sqlca() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSqlerrm().setParent(this,getStartOffset() + 16);
					getSqlwarn().setParent(this,getStartOffset() + 120);
					getSqlext().setParent(this,getStartOffset() + 128);
	   	/*  end of offset */
    }





}
  
