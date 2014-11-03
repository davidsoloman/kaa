/*
 * Copyright 2014 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#ifndef KAADEFAULTS_HPP_
#define KAADEFAULTS_HPP_

#include <map>
#include <list>
#include <string>

#include <botan/base64.h>
#include <boost/cstdint.hpp>

#include "kaa/channel/server/IServerInfo.hpp"

namespace kaa {

/**
 * Base endpoint configuration
 */

extern const char * const APPLICATION_TOKEN;

extern const boost::uint32_t PROFILE_VERSION;

extern const boost::uint32_t CONFIG_VERSION;

extern const boost::uint32_t SYSTEM_NF_VERSION;

extern const boost::uint32_t USER_NF_VERSION;

extern const boost::uint32_t LOG_SCHEMA_VERSION;

extern const boost::uint32_t POLLING_PERIOD_SECONDS;

extern const char * const CLIENT_PUB_KEY_LOCATION;

extern const char * const CLIENT_PRIV_KEY_LOCATION;

extern const char * const CLIENT_STATUS_FILE_LOCATION;

typedef std::vector<IServerInfoPtr> BootstrapServers;
const BootstrapServers& getServerInfoList();

const Botan::SecureVector<boost::uint8_t>& getDefaultConfigData();
const std::string& getDefaultConfigSchema();

typedef std::map<std::string, boost::int32_t> EventClassFamilyVersionInfos;
const EventClassFamilyVersionInfos& getEventClassFamilyVersionInfo();

}

#endif /* KAADEFAULTS_HPP_ */