/*
 * Copyright 2010 Vladimir Sch�fer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.security.saml.websso;

import org.opensaml.common.SAMLObject;
import org.opensaml.ws.message.decoder.MessageDecodingException;

/**
 * Implementations must load referenced artifact using SAML artifact resolution protocol.
 */
public interface ArtifactResolutionProfile {

    /**
     * Implementation must resolve artifact with the given ID, locate endpoint usable for it resolution
     * and load referenced SAML message.
     *
     * @param artifactId artifact to resolve
     * @param endpointURI URI of the endpoint the message was sent to
     * @return message the artifact references
     * @throws MessageDecodingException in case message loading fails
     */
    SAMLObject resolveArtifact(String artifactId, String endpointURI) throws MessageDecodingException;

}