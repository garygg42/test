#!/bin/bash
if [[ $@ == *"-dp"* ]]; then
	cp -rp ./deploy/* ./
	rm -rf ./deploy/*
fi
if [[ $@ == *"-dt"* ]]; then
	rm -rf ./data
fi
if [[ $@ == *"-zo"* ]]; then
	rm -rf ./zookeeper
fi
if [[ $1 == "" ]]; then
	rm -rf ./data
	rm -rf ./log
	rm -rf ./instances
	rm -rf ./repository
	rm -rf ./lock
	rm -rf ./derby.log
	rm -rf ./zookeeper
	rm -rf ./system/.timestamps
	cp -rp ./deploy/* ./
	rm -rf ./deploy/*
fi
$SHELL