/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.security;

import co.elastic.clients.base.ElasticsearchError;
import co.elastic.clients.base.Endpoint;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: security.put_user.Request
public final class PutUserRequest extends RequestBase implements ToJsonp {
	private final String username;

	@Nullable
	private final JsonValue refresh;

	@Nullable
	private final JsonValue email;

	@Nullable
	private final JsonValue fullName;

	@Nullable
	private final Map<String, JsonValue> metadata;

	@Nullable
	private final String password;

	@Nullable
	private final String passwordHash;

	@Nullable
	private final List<String> roles;

	@Nullable
	private final Boolean enabled;

	// ---------------------------------------------------------------------------------------------

	protected PutUserRequest(Builder builder) {

		this.username = Objects.requireNonNull(builder.username, "username");
		this.refresh = builder.refresh;
		this.email = builder.email;
		this.fullName = builder.fullName;
		this.metadata = builder.metadata;
		this.password = builder.password;
		this.passwordHash = builder.passwordHash;
		this.roles = builder.roles;
		this.enabled = builder.enabled;

	}

	/**
	 * API name: {@code username}
	 */
	public String username() {
		return this.username;
	}

	/**
	 * API name: {@code refresh}
	 */
	@Nullable
	public JsonValue refresh() {
		return this.refresh;
	}

	/**
	 * API name: {@code email}
	 */
	@Nullable
	public JsonValue email() {
		return this.email;
	}

	/**
	 * API name: {@code full_name}
	 */
	@Nullable
	public JsonValue fullName() {
		return this.fullName;
	}

	/**
	 * API name: {@code metadata}
	 */
	@Nullable
	public Map<String, JsonValue> metadata() {
		return this.metadata;
	}

	/**
	 * API name: {@code password}
	 */
	@Nullable
	public String password() {
		return this.password;
	}

	/**
	 * API name: {@code password_hash}
	 */
	@Nullable
	public String passwordHash() {
		return this.passwordHash;
	}

	/**
	 * API name: {@code roles}
	 */
	@Nullable
	public List<String> roles() {
		return this.roles;
	}

	/**
	 * API name: {@code enabled}
	 */
	@Nullable
	public Boolean enabled() {
		return this.enabled;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.email != null) {

			generator.writeKey("email");
			generator.write(this.email);

		}
		if (this.fullName != null) {

			generator.writeKey("full_name");
			generator.write(this.fullName);

		}
		if (this.metadata != null) {

			generator.writeKey("metadata");
			generator.writeStartObject();
			for (Map.Entry<String, JsonValue> item0 : this.metadata.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.password != null) {

			generator.writeKey("password");
			generator.write(this.password);

		}
		if (this.passwordHash != null) {

			generator.writeKey("password_hash");
			generator.write(this.passwordHash);

		}
		if (this.roles != null) {

			generator.writeKey("roles");
			generator.writeStartArray();
			for (String item0 : this.roles) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.enabled != null) {

			generator.writeKey("enabled");
			generator.write(this.enabled);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutUserRequest}.
	 */
	public static class Builder implements ObjectBuilder<PutUserRequest> {
		private String username;

		@Nullable
		private JsonValue refresh;

		@Nullable
		private JsonValue email;

		@Nullable
		private JsonValue fullName;

		@Nullable
		private Map<String, JsonValue> metadata;

		@Nullable
		private String password;

		@Nullable
		private String passwordHash;

		@Nullable
		private List<String> roles;

		@Nullable
		private Boolean enabled;

		/**
		 * API name: {@code username}
		 */
		public Builder username(String value) {
			this.username = value;
			return this;
		}

		/**
		 * API name: {@code refresh}
		 */
		public Builder refresh(@Nullable JsonValue value) {
			this.refresh = value;
			return this;
		}

		/**
		 * API name: {@code email}
		 */
		public Builder email(@Nullable JsonValue value) {
			this.email = value;
			return this;
		}

		/**
		 * API name: {@code full_name}
		 */
		public Builder fullName(@Nullable JsonValue value) {
			this.fullName = value;
			return this;
		}

		/**
		 * API name: {@code metadata}
		 */
		public Builder metadata(@Nullable Map<String, JsonValue> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #metadata(Map)}, creating the map if needed.
		 */
		public Builder putMetadata(String key, JsonValue value) {
			if (this.metadata == null) {
				this.metadata = new HashMap<>();
			}
			this.metadata.put(key, value);
			return this;
		}

		/**
		 * API name: {@code password}
		 */
		public Builder password(@Nullable String value) {
			this.password = value;
			return this;
		}

		/**
		 * API name: {@code password_hash}
		 */
		public Builder passwordHash(@Nullable String value) {
			this.passwordHash = value;
			return this;
		}

		/**
		 * API name: {@code roles}
		 */
		public Builder roles(@Nullable List<String> value) {
			this.roles = value;
			return this;
		}

		/**
		 * API name: {@code roles}
		 */
		public Builder roles(String... value) {
			this.roles = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #roles(List)}, creating the list if needed.
		 */
		public Builder addRoles(String value) {
			if (this.roles == null) {
				this.roles = new ArrayList<>();
			}
			this.roles.add(value);
			return this;
		}

		/**
		 * API name: {@code enabled}
		 */
		public Builder enabled(@Nullable Boolean value) {
			this.enabled = value;
			return this;
		}

		/**
		 * Builds a {@link PutUserRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutUserRequest build() {

			return new PutUserRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for PutUserRequest
	 */
	public static final JsonpValueParser<PutUserRequest> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, PutUserRequest::setupPutUserRequestParser);

	protected static void setupPutUserRequestParser(DelegatingJsonpValueParser<PutUserRequest.Builder> op) {

		op.add(Builder::email, JsonpValueParser.jsonValueParser(), "email");
		op.add(Builder::fullName, JsonpValueParser.jsonValueParser(), "full_name");
		op.add(Builder::metadata, JsonpValueParser.stringMapParser(JsonpValueParser.jsonValueParser()), "metadata");
		op.add(Builder::password, JsonpValueParser.stringParser(), "password");
		op.add(Builder::passwordHash, JsonpValueParser.stringParser(), "password_hash");
		op.add(Builder::roles, JsonpValueParser.arrayParser(JsonpValueParser.stringParser()), "roles");
		op.add(Builder::enabled, JsonpValueParser.booleanParser(), "enabled");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code security.put_user}".
	 */
	public static final Endpoint<PutUserRequest, PutUserResponse, ElasticsearchError> ENDPOINT = new Endpoint.Simple<>(
			// Request method
			request -> "POST",

			// Request path
			request -> {
				StringBuilder buf = new StringBuilder();
				buf.append("/_security");
				buf.append("/user");
				buf.append("/");
				buf.append(request.username);
				return buf.toString();

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.refresh != null) {
					params.put("refresh", request.refresh.toString());
				}
				return params;

			}, Endpoint.Simple.emptyMap(), true, PutUserResponse.JSONP_PARSER);
}