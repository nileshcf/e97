package com.cloudframe.app.d5427dt1.dto;

/**
*  The class StandardVars is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class StandardVars extends StandardVarsSerialized {
   

						@Getter @Setter private char[] thisViewName = new char[8];

						@Getter @Setter private char[] db2Paragraph = new char[8];

						@Getter @Setter private char[] db2Resource = new char[30];

						@Getter @Setter private char[] db2Action = new char[10];

						@Getter @Setter private char[] dsntiar01 = new char[8];

						@Getter @Setter private char[] callingApplication = Field.fillLowValue(8);

								@Getter @Setter private short iDx;

						@Getter @Setter private char[] vp776a0001 = new char[8];
				@Getter @Setter private CurrentVariables currentVariables = new CurrentVariables();
				@Getter @Setter private AsnVariables asnVariables = new AsnVariables();
				@Getter @Setter private SysVariables sysVariables = new SysVariables();

						@Getter @Setter private char[] ceefrst = new char[8];
				@Getter @Setter private StorageAllocVars storageAllocVars = new StorageAllocVars();
				@Getter @Setter private Fc fc = new Fc();
	
	/**
	* Constructor for StandardVars
	**/
    public StandardVars() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getCurrentVariables().setParent(this,getStartOffset() + 82);
					getAsnVariables().setParent(this,getStartOffset() + 134);
					getSysVariables().setParent(this,getStartOffset() + 178);
					getStorageAllocVars().setParent(this,getStartOffset() + 222);
					getFc().setParent(this,getStartOffset() + 230);
	   	/*  end of offset */
								setThisViewName(("D5427DT1").toCharArray());
								setDb2Paragraph(fillSpace(8));
								setDb2Resource(fillSpace(30));
								setDb2Action(fillSpace(10));
								setDsntiar01(("DSNTIAR ").toCharArray());
								setVp776a0001(("VP776A00").toCharArray());
								setCeefrst(("CEEFRST ").toCharArray());
    }





}
  
