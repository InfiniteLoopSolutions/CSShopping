package com.shopping.basket;

	//Builder
	public class Fruit {
				
		public final String name;
		public final double price;
		
		//Optional
		public final String type;
		
		public static class Builder {
			// Required parameters
			private String name;
			private double price;

			private String type;
			
			public Builder(String name,  double price) {
				this.name = name;
				this.price = price;
			}

			public Builder type(String type) {
				this.type = type;
				return this;
			}

			public Fruit build() {
				return new Fruit(this);
			}
		}

		private Fruit(Builder builder) {
			// Required parameters
			this.name = builder.name;
			this.price = builder.price;

			// Optional parameters
			this.type = builder.type;			
		}
	}

