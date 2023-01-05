package fish.genius.config

import com.typesafe.config.{Config, ConfigFactory}

trait Configurable {
  def config: Config = Configuration.config

}
