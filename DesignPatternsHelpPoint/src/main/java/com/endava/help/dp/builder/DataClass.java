package com.endava.help.dp.builder;

public class DataClass {
	private final String mandatoryField;
	private final String otherMandatoryField;
	private final String optionalField;
	private final String otherOptionalField;

	public DataClass(String mandatoryField, String otherMandatoryField, String optionalField,
			String otherOptionalField) {
		this.mandatoryField = mandatoryField;
		this.otherMandatoryField = otherMandatoryField;
		this.optionalField = optionalField;
		this.otherOptionalField = otherOptionalField;
	}

	public String getMandatoryField() {
		return mandatoryField;
	}

	public String getOtherMandatoryField() {
		return otherMandatoryField;
	}

	public String getOptionalField() {
		return optionalField;
	}

	public String getOtherOptionalField() {
		return otherOptionalField;
	}

	public static withOtherMandatoryField with(String mandatoryField) {
		return new DataClassBuilder(mandatoryField);
	}

	public interface withOtherMandatoryField {
		DataClassBuilder withField(String otherMandatoryField);
	}

	public static class DataClassBuilder implements withOtherMandatoryField {
		private String mandatoryField;
		private String otherMandatoryField;
		private String optionalField;
		private String otherOptionalField;

		public DataClassBuilder(String mandatoryField) {
			this.mandatoryField = mandatoryField;
		}

		public DataClassBuilder withOptionalField(String optionalField) {
			this.optionalField = optionalField;
			return this;
		}

		public DataClassBuilder withOtherOptionalField(String otherOptionalField) {
			this.otherOptionalField = otherOptionalField;
			return this;
		}

		public DataClass build() {
			return new DataClass(mandatoryField, otherMandatoryField, optionalField, otherOptionalField);
		}

		@Override
		public DataClassBuilder withField(String otherMandatoryField) {
			this.otherMandatoryField = otherMandatoryField;
			return this;
		}
	}

}
